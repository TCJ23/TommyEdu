package advanced.java.generics.issue23;

class Demo_Generic_Class {
    public static void main(String[] args) {

        SimpleGeneric<String> string = new SimpleGeneric<String>(" TO JA STRING");
        SimpleGeneric<Boolean> bool = new SimpleGeneric<Boolean>(Boolean.TRUE);
        bool.printType();
        string.printType();
    }
}

class SimpleGeneric<T> {
    private T objectRef = null;

    public SimpleGeneric(T objectRef) {
        this.objectRef = objectRef;
    }

    public T getObjectRef() {
        return objectRef;
    }

    public void printType() {
        System.out.println("Type of object is " + objectRef.getClass().getSimpleName());
    }
}