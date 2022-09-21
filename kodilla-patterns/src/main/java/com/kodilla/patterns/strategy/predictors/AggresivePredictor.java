package com.kodilla.patterns.strategy.predictors;

public final class AggresivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggresive predictor] Buy stock of XYZ";
    }
}
