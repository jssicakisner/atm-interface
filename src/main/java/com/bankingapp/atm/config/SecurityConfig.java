package com.bankingapp.atm.config;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.bankingapp.atm.service.UserServiceImpl.UserSecurityService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private Environment env;

    @Autowired
    private UserSecurityService userSecurityService;

    private static final String SALT = "salt"; // Salt should be protected carefully

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/images/**",
            "/",
            "/about/**",
            "/contact/**",
            "/error/**/*",
            "/console/**",
            "/signup"
    };

        @Bean
        public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorizeRequests ->
            authorizeRequests
                .requestMatchers(PUBLIC_MATCHERS)
                .permitAll()
                .anyRequest()
                .authenticated())
            .formLogin(login -> login
                .loginPage("/login")
                .permitAll())
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/index?logout")
                .deleteCookies("remember-me")
                .permitAll())
            .rememberMe();

        http
            .csrf(csrf -> csrf.disable())
            .cors(cors -> {});

        return http.build();
        }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    //    auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }

}
