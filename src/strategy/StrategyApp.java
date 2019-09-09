package strategy;

import strategy.impl.Multiplication;
import strategy.impl.Substraction;
import strategy.impl.Sum;

public class StrategyApp {

    public static void main(String[] args) {

        ArithmeticOperationContext arithmeticOperationContext;
        arithmeticOperationContext = new ArithmeticOperationContext(new Sum());
        System.out.println("Sum: "+arithmeticOperationContext.solve(1,2));

        arithmeticOperationContext = new ArithmeticOperationContext(new Multiplication());
        System.out.println("Multiplication: "+arithmeticOperationContext.solve(1,2));

        arithmeticOperationContext = new ArithmeticOperationContext(new Substraction());
        System.out.println("Substraction: "+arithmeticOperationContext.solve(1,2));


    }

}
