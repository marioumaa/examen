package tn.esprit.examen.EllefiMariem4nids4Examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.Client;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.User;
import tn.esprit.examen.EllefiMariem4nids4Examen.services.UserService;

@RequiredArgsConstructor
@RequestMapping("examen")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public User add(@RequestBody User user){
        return  userService.addUser(user);
    }
}
