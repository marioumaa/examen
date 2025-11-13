package tn.esprit.examen.EllefiMariem4nids4Examen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examen.EllefiMariem4nids4Examen.entities.*;
import tn.esprit.examen.EllefiMariem4nids4Examen.repositories.IClientRepository;

@Slf4j
@RequiredArgsConstructor
@Service
public class ServicesImpl implements IServices {
    @Autowired
     IClientRepository clientRepository;

    @Override
    public Client add(Client client) {
        return clientRepository.save(client);
    }

//   @Scheduled(cron = "*/15 * * * * *")
//    @Override
//    public void test() {
//        log.info("testing");
//    }
}
