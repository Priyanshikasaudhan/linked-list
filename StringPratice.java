// Enter the statement: Priyanshi KAsaudhan karji
// Priyanshi KAsaudhan karji
// The length of the last word is: 5
import java.util.Scanner;

public class StringPratice {
    public static int lastLengthCount(String s){
        int count =0;
        int i = s.length()-1;
        while (i>=0 && s.charAt(i) == ' ') {
            i--; 
        }
        while (i>=0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the statement: ");
        String s = sc.nextLine();
        System.out.println(s);
        int a = lastLengthCount(s);
        System.out.println("The length of the last word is: " + a);
    }
}
