package com.gustavo.guflix.domain.validation.handler;

import com.gustavo.guflix.domain.exception.DomainException;
import com.gustavo.guflix.domain.validation.Error;
import com.gustavo.guflix.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(Error anError) {
        throw DomainException.with(List.of());
    }

    @Override
    public ValidationHandler append(ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation aValidation) {
        try{
            aValidation.validate();
        } catch (final Exception ex){
            throw DomainException.with(List.of(new java.lang.Error(ex.getMessage())));
        }
        return this;
    }

    @Override
    public List<java.lang.Error> getErrors() {
        return List.of();
    }
}
