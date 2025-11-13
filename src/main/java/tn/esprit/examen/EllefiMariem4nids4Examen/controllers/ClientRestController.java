package tn.esprit.examen.EllefiMariem4nids4Examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.Client;
import tn.esprit.examen.EllefiMariem4nids4Examen.services.IServices;

@RequiredArgsConstructor
@RequestMapping("examen")
@RestController
public class ClientRestController {
    @Autowired
     IServices services;

    @PostMapping("/add")
    public Client add(@RequestBody Client client){
        return  services.add(client);
    }

}
