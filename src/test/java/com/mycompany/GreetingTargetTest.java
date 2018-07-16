package com.mycompany;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetingTargetTest {
    @Test
    public void testGet() {
        StubCoinImpl stubCoin = new StubCoinImpl();

        GreeterTarget greeterTarget = new GreeterTargetImpl(stubCoin);
        stubCoin.setConstantResult(true);
        assertEquals("Spring", greeterTarget.get());

        stubCoin.setConstantResult(false);
        assertEquals("World!", greeterTarget.get());

    }
}
