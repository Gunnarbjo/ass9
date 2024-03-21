package is.hi.hbv202g.ass9.compositeObserved;

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

    public int getLastObservedResult() {
        return this.lastObservedResult;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }
}
