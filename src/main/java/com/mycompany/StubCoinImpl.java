package com.mycompany;

public class StubCoinImpl implements Coin {
    private boolean constantResult;

    public void setConstantResult(boolean constantResult) {
        this.constantResult = constantResult;
    }

    @Override
    public boolean toss() {
        return constantResult;
    }
}
