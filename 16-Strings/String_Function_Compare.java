public class String_Function_Compare {
    public static void main(String args[]){
        String s1 = "udm";
        String s2 = "udm";
        String s3 = new String("udm");
        
        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
            
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
            
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
            
        }
        
    
    }
}
