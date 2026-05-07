import java.util.*;
public class StringReplacement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String pat= sc.nextLine();
        String rep= sc.nextLine();

        String result= s.replace(pat,rep);
        System.out.println(result);
    }
    
}
