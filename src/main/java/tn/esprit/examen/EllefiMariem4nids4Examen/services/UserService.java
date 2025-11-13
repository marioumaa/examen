package tn.esprit.examen.EllefiMariem4nids4Examen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.User;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.IUserRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService implements IUser {
    @Autowired
    IUserRepository userRepository;

    @Override
    public User addUser(User u) {
        return userRepository.save(u);
    }
}
