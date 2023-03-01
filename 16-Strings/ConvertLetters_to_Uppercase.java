public class ConvertLetters_to_Uppercase {
    public static String toUpperCase(String str){
        StringBuffer sb = new StringBuffer("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); 
                sb.append(Character.toUpperCase(str.charAt(i)));
                i++;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi, i am shradha";

        System.out.println(toUpperCase(str));
            
    
    }    
}
