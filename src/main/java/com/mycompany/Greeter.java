package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greeter {
    GreeterTarget greeterTarget;

    @Autowired
    public Greeter(GreeterTarget greeterTarget) {
        this.greeterTarget = greeterTarget;
    }

    public final String greet(){
        return "Hello "  + greeterTarget.get() + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
}

