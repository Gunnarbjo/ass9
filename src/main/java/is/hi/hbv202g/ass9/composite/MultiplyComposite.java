package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression{
    private List<MathExpression> numbers = new ArrayList<MathExpression>();
    
    public void add(MathExpression number) {
        numbers.add(number);
    }
    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression number : numbers) {
            result *= number.getResult();
        }
        return result;
    }
}
