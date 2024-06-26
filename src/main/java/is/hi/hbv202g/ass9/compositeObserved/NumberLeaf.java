package is.hi.hbv202g.ass9.compositeObserved;

public class NumberLeaf extends Observable implements MathExpression{
    private int number;
    
    public NumberLeaf(int number) {
        this.number = number;
    }
    
    public int getResult() {
        return this.number;
    }
    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }
}
