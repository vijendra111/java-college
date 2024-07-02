// package Sorting;

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};

        // Time Complexity = O(n^2)
        // Bubble Sort
        // arr.length = n
        // outer loop
        for(int i =0; i<arr.length-1;i++){ // n-1
            for(int j =0; j<arr.length-i-1;j++){ //n,n-1,n-2,n-2   in complexity we remove constants so here is only it runs for n times 
                // insted of arr.length-i-1 we can write arr.length-1(best complexity ) then previous one
                if(arr[j] > arr[j+1]){  // Ascending
                // if(arr[j] < arr[j+1]){   Decending 
                    // Swap
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];

                }
            }
        }
        printArray(arr);

    }
}
