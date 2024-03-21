package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer{
    private List<MathExpression> numbers = new ArrayList<MathExpression>();
    
    public void add(MathExpression number) {
        numbers.add(number);
    }
    
    public int getResult() {
        int result = 1;
        for (MathExpression number : numbers) {
            result *= number.getResult();
        }
        return result;
    }
    public void update() {
        System.out.println(getResult());
    }
}
