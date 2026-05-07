import java.util.Scanner;

public class formatLargeProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        long prod=1;
        for(int i=A;i<=B;i++){
            prod*=i;
        }
        int E=0;
        while(prod%10==0){
            prod/=10;
            E++;
        }

        long D =prod;
        System.out.println(D +" "+E);
    }
}
