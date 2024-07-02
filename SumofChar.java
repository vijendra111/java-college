public class SumofChar {
    public static void main(String s[]){
        String str = "hello";
        int sum = 0;
        for(int i = 0 ; i < str.length() ; ++i){
            sum += str.charAt(i);
            // System.out.println(str.charAt(i));
        }
        System.out.println(sum);
        
    }
}
