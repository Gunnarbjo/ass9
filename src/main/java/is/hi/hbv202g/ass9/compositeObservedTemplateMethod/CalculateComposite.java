package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculateComposite implements MathExpression, Observer{
    protected int lastObservedResult;
    protected List<MathExpression> Children = new ArrayList<MathExpression>();
    
    public void add(MathExpression number) {
        Children.add(number);
    }
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }
    public int getLastObserverResult() {
        return lastObservedResult;
    }
}
