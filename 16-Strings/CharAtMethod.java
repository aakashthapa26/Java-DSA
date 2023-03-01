

public class CharAtMethod {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); 
    }
    public static void main(String args[]){   
        String firstName = "Aakash";   
        String lastName = "Thapa";
        String FullName = firstName + " " + lastName;

        printLetters(FullName); 
    }
}



