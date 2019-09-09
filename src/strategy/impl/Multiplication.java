package strategy.impl;

import strategy.ArithmeticOperation;

public class Multiplication implements ArithmeticOperation {
    @Override
    public int solve(int valueA, int valueB) {
        return valueA*valueB;
    }
}
