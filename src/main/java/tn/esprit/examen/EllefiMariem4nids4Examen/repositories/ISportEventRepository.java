package tn.esprit.examen.EllefiMariem4nids4Examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportEvent;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportType;

public interface ISportEventRepository extends JpaRepository<SportEvent, Long> {
    public SportEvent findByTypeLike(SportType type);
}
