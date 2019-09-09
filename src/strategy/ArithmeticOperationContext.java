package strategy;

public class ArithmeticOperationContext {

    private ArithmeticOperation arithmeticOperation;

    public ArithmeticOperationContext(ArithmeticOperation arithmeticOperation){
        this.arithmeticOperation = arithmeticOperation;
    }

    public int solve(int valueA, int valueB){
        return arithmeticOperation.solve(valueA,valueB);
    }
}
