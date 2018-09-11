package advanced.java.design.patterns.issue27.creational.abstractfactory.v1;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
