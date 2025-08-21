public class palindrome {
    public static void main(String[] args) {
        int n=121;
        int reversed= rev(n);
        if(n==reversed){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
     public static int rev(int n){
      int reverse=0;
      while(n>0){
        int digit= n%10;
        reverse= reverse*10+digit;
        n=n/10;
      }
      return reverse;

    }
}
