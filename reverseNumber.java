public class reverseNumber {
    public static void main(String srgs[]){
        int num = 789456;
        int ans = 0;
        while(num > 0){
            int n = num%10;
            num /= 10;
            ans = (ans * 10 ) + n;
        }
        System.out.println(ans);
    }
}
