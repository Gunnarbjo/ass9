package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;



public class PlusComposite extends CalculateComposite{
    
    public int getResult() {
        int result = 0;
        for (MathExpression number : numbers) {
            result += number.getResult();
        }
        return result;
    }
}
