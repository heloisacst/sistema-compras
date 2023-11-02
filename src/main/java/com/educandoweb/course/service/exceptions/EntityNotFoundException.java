package com.educandoweb.course.service.exceptions;

import java.io.Serializable;

public class EntityNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public EntityNotFoundException(){
        super("O not found");
    }
}
