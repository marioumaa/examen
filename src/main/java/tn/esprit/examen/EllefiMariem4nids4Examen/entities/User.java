package tn.esprit.examen.EllefiMariem4nids4Examen.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUser;

    private Long cin;
    private String name;
    private float amount;
    @OneToMany
    private List<SportEvent> sportEvents;




}
