package com.library.web.exceptions;

public class ClientNofFoundException extends RuntimeException {
    public ClientNofFoundException(Long id) {
        super("Client id not found : " + id);
    }

}
