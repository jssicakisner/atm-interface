# ATM Interface

This is a Java project that simulates an ATM for a banking application. It uses Maven for dependency management. It implements the UserDetails interface from Spring Security, which provides methods for authentication and authorization. The application also tracks transactions and the User can access a Primary Account and a Savings Account where they can Deposit and Withdraw from it. The user can also set appointments and view them.

## Getting Started

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Set up your database connection by modifying the `application.properties` file located in `src/main/resources`. Replace the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` values with your own database credentials.
4. Set up your database, in my case I used MySQL.
5. Run the project.
6. Open it in your prefered browser, for example `http://localhost:8080/`.

## Technologies Used

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web.security)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#using.devtools)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)


## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.