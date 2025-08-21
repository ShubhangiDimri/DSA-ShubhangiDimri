public class reverseNumber{
    public static void main(String[] args) {
        rev(123);
    }
    public static void rev(int n){
       if(n<10){
        System.out.println(n);
        return;
       } 
       else{
        System.out.println(n%10);
        rev(n/10);
       }
    }
} 
