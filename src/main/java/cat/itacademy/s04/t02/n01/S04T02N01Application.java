package cat.itacademy.s04.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T02N01Application {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01Application.class, args);
	}

}
/*
Compilar el Proyecto: mvn compile
Empaquetar el Proyecto: mvn package
Limpiar el Proyecto: mvn clean
Ejecutar la Aplicación: mvn spring-boot:run
*/
 /* http://localhost:8080/fruit/add
    http://localhost:8080/fruit/update
    http://localhost:8080/fruit/delete/{id}
    http://localhost:8080/fruit/getOne/{id}
    http://localhost:8080/fruit/getAll
    http://localhost:8080/h2-console
    JDBC URL: jdbc:h2:mem:testdb
    http://localhost/phpmyadmin/
*/