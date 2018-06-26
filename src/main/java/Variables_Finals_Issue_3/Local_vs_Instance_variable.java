package Variables_Finals_Issue_3;

public class Local_vs_Instance_variable {
    String phoneNumber = "123456789";
        void setPhoneNumber(){
            String phoneNumber;
            phoneNumber = "987654321";
        }

    public static void main(String[] args) {
        Local_vs_Instance_variable p1 = new Local_vs_Instance_variable();
        p1.setPhoneNumber();
        System.out.println(p1.phoneNumber);
    }
}
