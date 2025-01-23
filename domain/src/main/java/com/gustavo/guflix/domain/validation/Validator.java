package com.gustavo.guflix.domain.validation;


// classe pai dos validadores
public abstract class Validator {
    private final ValidationHandler handler;

    protected Validator(final ValidationHandler ahandler) {
        this.handler = ahandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler(){
        return this.handler;
    }
}
