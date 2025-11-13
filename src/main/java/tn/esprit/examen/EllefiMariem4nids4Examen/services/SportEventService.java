package tn.esprit.examen.EllefiMariem4nids4Examen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportEvent;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.ISportEventRepository;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.ITicketRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class SportEventService implements ISportEvent {
    @Autowired
    ISportEventRepository sportEventRepository;
    ITicketRepository ticketRepository;

    @Override
    public SportEvent addSportEventAndTicket(SportEvent s) {
        SportEvent sportEvent = sportEventRepository.save(s);
        sportEvent.getTickets().forEach(t ->
        {
            t.setSportEvent(sportEvent);
            ticketRepository.save(t);

        });
        return sportEvent;
    }


}






