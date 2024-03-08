package com.bank.solid.dependencyInversion.example.reader;

public class UserReader {
    private Reader reader;

    public UserReader(Reader reader) {
        this.reader = reader;
    }

    public String getUsername(){
        return reader.getUsername();
    }
}
