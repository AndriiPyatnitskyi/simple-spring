package com.mycompany;

import java.util.Random;

public class StubRandom extends Random {
    private boolean constantResult;

    public void setConstantResult(boolean newResult) {
        this.constantResult = newResult;
    }

    @Override
    public boolean nextBoolean() {
        return constantResult;
    }
}
