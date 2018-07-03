import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");    // Insert "A" in the stack
        stack.push("B");    // Insert "B" in the stack
        stack.push("C");    // Insert "C" in the stack
        stack.push("D");    // Insert "D" in the stack
        System.out.println(stack.peek());    // Prints the top of the stack ("D")
        stack.pop();    // removing the top ("D")
        stack.pop();    // removing the next top ("C")

        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ");
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);

        String x = "big surprise";
        System.out.println(x.toString());
        System.out.println(x);
        System.out.println("x");
    }
}