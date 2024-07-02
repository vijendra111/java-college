public interface ls {
    public static void main(String [] args) {
        int arr[] = {5,6,8,4,9,5,6};
        int num = 6;
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] == num){
                System.out.println(i);
                return;
            }
        }
    }   
}
