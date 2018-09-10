package advanced.java.design.patterns.issue27.creational.abstractfactory.v1;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
