package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.AggresivePredictor;
import com.kodilla.patterns.strategy.predictors.BalancedPredictor;
import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public sealed interface BuyPredictor permits AggresivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();
}
