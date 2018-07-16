package com.mycompany;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {
    @Test
    public void testGreet() {
        GreeterTarget target = new StubGreetingTarget();
        Greeter greeter = new Greeter(target);
        assertEquals("Hello TEST!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", greeter.greet());
    }
}
