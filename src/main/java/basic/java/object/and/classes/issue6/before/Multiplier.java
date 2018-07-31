package basic.java.object.and.classes.issue6.before;

/**
 * Created by Jim on 10/10/2015.
 */
public class Multiplier extends CalculateBase {
    public Multiplier() {}
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);;
    }
}
