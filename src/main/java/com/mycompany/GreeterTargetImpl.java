package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreeterTargetImpl implements GreeterTarget {
    private Coin coin;

    @Autowired
    public GreeterTargetImpl(Coin coin) {
        this.coin = coin;
    }

    @Override
    public String get() {
        if (coin.toss()) {
            return "Spring";
        }
        return "World!";
    }
}
