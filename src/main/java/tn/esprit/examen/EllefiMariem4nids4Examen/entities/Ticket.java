package tn.esprit.examen.EllefiMariem4nids4Examen.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private Long numT;
    private boolean status;
    private float price;
    @Enumerated(EnumType.STRING)
    private Category category;
    @ManyToOne
    private SportEvent sportEvent;
}
