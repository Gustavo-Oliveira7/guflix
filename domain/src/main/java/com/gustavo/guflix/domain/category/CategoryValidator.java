package com.gustavo.guflix.domain.category;

import com.gustavo.guflix.domain.validation.Error;
import com.gustavo.guflix.domain.validation.ValidationHandler;
import com.gustavo.guflix.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory
                             ,final ValidationHandler ahandler) {
        super(ahandler);
        this.category = aCategory;
    }

    @Override
    public void validate(){

        if(this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
