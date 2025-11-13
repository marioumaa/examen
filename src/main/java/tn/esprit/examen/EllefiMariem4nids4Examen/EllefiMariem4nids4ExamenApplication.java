package tn.esprit.examen.EllefiMariem4nids4Examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@EnableScheduling
@SpringBootApplication
public class EllefiMariem4nids4ExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(EllefiMariem4nids4ExamenApplication.class, args);
    }

}
