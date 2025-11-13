package tn.esprit.examen.EllefiMariem4nids4Examen.services;

import tn.esprit.examen.EllefiMariem4nids4Examen.entities.Category;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportType;

import java.lang.reflect.Type;
import java.util.Set;

public interface ITicket {
    public void unassignTicketFromSportEvent(Set<Category> categories, SportType type);
}
