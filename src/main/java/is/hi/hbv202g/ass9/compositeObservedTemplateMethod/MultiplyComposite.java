package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends CalculateComposite{

    public int getResult() {
        int result = 1;
        for (MathExpression number : numbers) {
            result *= number.getResult();
        }
        return result;
    }

}
