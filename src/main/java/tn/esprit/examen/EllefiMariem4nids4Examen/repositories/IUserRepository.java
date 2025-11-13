package tn.esprit.examen.EllefiMariem4nids4Examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.User;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {


}
