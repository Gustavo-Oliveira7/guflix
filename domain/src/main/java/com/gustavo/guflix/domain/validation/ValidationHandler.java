package com.gustavo.guflix.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);


    List<java.lang.Error> getErrors();

//  verifica se o ValidationHandler tem erros dentro dele ou nao.
    default boolean hasError() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation {
        void validate();
    }
}
