package model.exceptions;

import model.Account;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
