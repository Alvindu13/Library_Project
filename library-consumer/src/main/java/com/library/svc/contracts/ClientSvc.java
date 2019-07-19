package com.library.svc.contracts;

import com.library.dao.model.Client;
import com.library.validation.ClientForm;

public interface ClientSvc {

    void createClient(ClientForm clientForm);
}
