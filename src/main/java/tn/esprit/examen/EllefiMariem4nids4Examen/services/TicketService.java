package tn.esprit.examen.EllefiMariem4nids4Examen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.Category;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportEvent;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportType;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.ISportEventRepository;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.ITicketRepository;

import java.lang.reflect.Type;
import java.util.Set;
@Slf4j
@RequiredArgsConstructor
@Service
public class TicketService implements ITicket{
    @Autowired
    ITicketRepository ticketRepository;
    ISportEventRepository sportEventRepository;
    @Override
    public void unassignTicketFromSportEvent(Set<Category> categories, SportType type) {

        SportEvent sportEvent=sportEventRepository.findByTypeLike(type);










    }
}
