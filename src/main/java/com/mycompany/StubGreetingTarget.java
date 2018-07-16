package com.mycompany;

public class StubGreetingTarget implements GreeterTarget {
    @Override
    public String get() {
        return "TEST";
    }
}
