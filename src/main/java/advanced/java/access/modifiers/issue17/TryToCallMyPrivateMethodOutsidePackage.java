package advanced.java.access.modifiers.issue17;

public class TryToCallMyPrivateMethodOutsidePackage {

    private void nieDaszRadyJestemPrywatna() {
        System.out.println("nie dasz rady wywołać mnie spoza pakietu");
    }

}
