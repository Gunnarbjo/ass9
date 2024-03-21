package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression{
    private List<MathExpression> numbers = new ArrayList<MathExpression>();
    
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

}
