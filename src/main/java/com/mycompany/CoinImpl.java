package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class CoinImpl implements Coin {
    private Random random;

    @Autowired
    public CoinImpl(Random random) {
        this.random = random;
    }

    @Override
    public boolean toss() {
        return random.nextBoolean();
    }
}
