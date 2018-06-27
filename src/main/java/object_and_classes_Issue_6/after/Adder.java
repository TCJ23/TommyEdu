package object_and_classes_Issue_6.after;

/**
 * Created by Jim on 10/10/2015.
 */
public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

}
