package advanced.java.toString.issue19;

public class ToString {
    private String name = "Tomasz";
    private String lastname = "Jurek";
    private String email = "t.k.jurek@gmail.com";
    public String nickname = "Tommy";

    @Override
    public String toString() {
        return name + " " + lastname + " No EMAIL " + nickname + " AND REMEMBER ALWAYS KISS - \n KEEP IT SIMPLE STUPID";
    }

    public static void main(String[] args) {
        ToString toString = new ToString();
        /*System.out.println("That's just my hash " + toString + "\n which would be exact as default toString method");
        System.out.println(" return getClass().getName() + \"@\" + Integer.toHexString(hashCode()); ---> MAKES ----> " + toString);*/
        System.out.println("So if I override default Object toString method to let say hide my email, this would be something like this ");
        System.out.println(toString.toString());
    }
}
