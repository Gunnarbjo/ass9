package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer{
    private List<MathExpression> numbers = new ArrayList<MathExpression>();
    private int lastObservedResult;
    
    public void add(MathExpression number) {
        numbers.add(number);
    }
    public int getResult() {
        int result = 0;
        for (MathExpression number : numbers) {
            result += number.getResult();
        }
        return result;
    }

    public int getLastObserverResult() {
        return this.lastObservedResult;
    }

    public void update() {
        System.out.println(getResult());
    }
}
