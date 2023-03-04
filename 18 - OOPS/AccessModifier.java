public class AccessModifier {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aakash Thapa";
        myAcc.setPassword("edf");
    }
}

class BankAccount {
    public String username;
    private String Password;
    public void setPassword(String pwd){
        Password = pwd;
    }
}