package object_and_classes_Issue_6.after;

/**
 * Created by Jim on 10/10/2015.
 */
public class Divider extends CalculateBase {
    public Divider() {
    }
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
        ;
    }
}