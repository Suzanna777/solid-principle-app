package com.bank.solid.dependencyInversion.example.reader;

public class XMLReader implements Reader{

    @Override
    public String getUsername() {
        return "username>mikesmith</username>";
    }
}
