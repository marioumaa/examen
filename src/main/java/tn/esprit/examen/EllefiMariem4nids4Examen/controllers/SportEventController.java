package tn.esprit.examen.EllefiMariem4nids4Examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.SportEvent;
import tn.esprit.examen.EllefiMariem4nids4Examen.services.SportEventService;

@RequiredArgsConstructor
@RequestMapping("examen")
@RestController
public class SportEventController {
    @Autowired
    SportEventService service;
    @PostMapping("/addSportEventEtTicket")
    public SportEvent ajouterSportEventEtTicket(@RequestBody SportEvent sportEvent)
    { return service.addSportEventAndTicket(sportEvent);


    }
}
