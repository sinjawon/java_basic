package etc.anonymous;

public class AddCalculator implements Calculator {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
