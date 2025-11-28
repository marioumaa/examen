package tn.esprit.examen.EllefiMariem4nids4Examen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String apiKey = "AIzaSyA-EXAMPLE-KEY-1234567890";
    private String password = "P@ssw0rd123!";

    Long id;
    String nom;
    String prenom;

    //
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Client() {
//    }
//
//    public Client(Long id, String nom) {
//        this.id = id;
//        this.nom = nom;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
}
