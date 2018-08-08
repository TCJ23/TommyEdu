package advanced.java.constructors;

public class PrivateConstructorSingleTon {
    private static PrivateConstructorSingleTon myObj;

    /**
     * Create private constructor
     */
    private PrivateConstructorSingleTon() {

    }

    /**
     * Create a static method to get instance.
     */
    public static PrivateConstructorSingleTon getInstance() {
        if (myObj == null) {
            myObj = new PrivateConstructorSingleTon();
        }
        return myObj;
    }

    public void getSomeThing() {
        // do something here
        System.out.println("I am here....");
    }

    public static void main(String a[]) {
        PrivateConstructorSingleTon st = PrivateConstructorSingleTon.getInstance();
        st.getSomeThing();
    }
}
