package advanced.java.classattributes.issue18;

import advanced.java.access.modifiers.issue17.TryToCallMyPrivateMethodOutsidePackage;

import java.lang.reflect.Method;

public class ImTryingToCallYourPrivateMethodOutsideofPakcage {
    public static void main(String[] args) throws Exception{
//        Class c = Class.forName("TryToCallMyPrivateMethodOutsidePackage");
                TryToCallMyPrivateMethodOutsidePackage tryCall = new TryToCallMyPrivateMethodOutsidePackage();
        System.out.println("Najpierw nie widzę żadnych metod");
//        Object obj = c.newInstance();
        Method m = TryToCallMyPrivateMethodOutsidePackage.class.getDeclaredMethod("nieDaszRadyJestemPrywatna");
        m.setAccessible(true);
//        m.invoke(obj);
        m.invoke(tryCall);
        }
    }
