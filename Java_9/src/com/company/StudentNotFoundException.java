package com.company;

class StudentNotFoundException extends RuntimeException implements LabClassUI {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}