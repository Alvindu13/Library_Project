package com.clientui.web.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;


public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String invoqueur, Response reponse) {

        if(reponse.status() == 400 ) {
            return new BookBadRequestException(
                    "Requête incorrecte "
            );
        }

        else if (reponse.status() == 404 ) {
            return new BooktNotFoundException(
                    "Produit non trouvé "
            );
        }

        return defaultErrorDecoder.decode(invoqueur, reponse);
    }

}
