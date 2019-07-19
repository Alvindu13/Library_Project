package com.library.svc.svcImpl;

import com.library.dao.model.Client;
import com.library.dao.repository.ClientRepository;
import com.library.svc.contracts.ClientSvc;
import com.library.validation.ClientForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientSvcImpl implements ClientSvc {

    // Config in WebSecurityConfig
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ClientRepository repo;

    @Override
    public void createClient(ClientForm clientForm) {

        //Long userId = this.getMaxUserId() + 1;
        String encrytedPassword = this.passwordEncoder.encode(clientForm.getPassword());

        Client client = new Client(clientForm.getFirstName(), //
                clientForm.getLastName(), clientForm.getMail(), //
                encrytedPassword);

        repo.save(client);

    }
}
