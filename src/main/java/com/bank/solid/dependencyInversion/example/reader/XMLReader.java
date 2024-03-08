package com.bank.solid.dependencyInversion.example.reader;

public class XMLReader implements Reader{
    @Override
    public String getUserName() {
        return "<username>mikesmith</username>";
    }
}
