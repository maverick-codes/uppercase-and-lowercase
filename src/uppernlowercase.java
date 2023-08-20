import java.util.Scanner;
public class uppernlowercase {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

         if(ch >= 'a' && ch <= 'z'){
             System.out.println(" THIS IS AN lowercase ALPHABET");
         }
         else{
             System.out.println(" THIS IS AN upperrcase ALPHABET");
         }


    }
}
