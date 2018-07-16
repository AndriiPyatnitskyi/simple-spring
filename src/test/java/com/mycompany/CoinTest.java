package com.mycompany;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoinTest {
    @Test
    public void testToss() {
        StubRandom random = new StubRandom();
        Coin coin = new CoinImpl(random);

        random.setConstantResult(true);
        assertTrue(coin.toss());

        random.setConstantResult(false);
        assertFalse(coin.toss());
    }
}
