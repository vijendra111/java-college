import java.util.Scanner;

public class prime {
    public static boolean primeOrNott(int n){
        for(int i = 2 ; i < n ; ++i){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(primeOrNott(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
