package com.randomme.classvalidator;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private List<Error> errorList;

    public Result() {
        this.errorList = new ArrayList<>();
    }

    public void addError( Error error ) {
        this.errorList.add( error );
    }

    public Error getErrorByIndex( int index ) {
        return this.errorList.get( index );
    }

    public List<Error> getErrorList() {
        return this.errorList;
    }

    public boolean isValid() {
        return this.errorList.isEmpty();
    }
}