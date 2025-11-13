package tn.esprit.examen.EllefiMariem4nids4Examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Long> {

}
