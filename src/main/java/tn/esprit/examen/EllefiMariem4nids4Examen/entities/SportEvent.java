package tn.esprit.examen.EllefiMariem4nids4Examen.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SportEvent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long idEvent;
    private String password = "P@ssw0rd123!";
    private LocalDate startDate;
    @Enumerated(EnumType.STRING)
    private SportType type;
    @OneToMany(mappedBy = "sportEvent",cascade = CascadeType.ALL)
    private List<Ticket> tickets;
}
