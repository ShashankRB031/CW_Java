public class Palndrome {
    public static void main(String[] args) {
        
        String str = "abccba";
        int i=0; 
        int j = str.length()-1;

        boolean flag = true;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag == true){
            System.out.println(str + " String is palindrome ");
        }
        else{
            System.out.println(str + " is not palindrome ");
        }


    }
}
