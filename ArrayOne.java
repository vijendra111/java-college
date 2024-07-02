
import java.util.*;
public class ArrayOne {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //int [] marks= new int[3];
        //insted of this we can also write
        int marks[]=new int[3];
        marks[0]=98;   //phy
        marks[1]=99;   //che
        marks[2]=95;   //eng
        System.out.println(marks);   //it print jargon value or garbage value
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("By using for loop:\n");
        
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        System.out.println();

        //Defining Array by another type
        int marka[]={98,96,98,99};   // here  we don't have to define index of the value.
        System.out.println(marka[0]);
        System.out.println(marka[1]);
        System.out.println(marka[2]);
        //by loop
        for (int i=0;i<3;i++){
            System.out.println(marka[i]);
        }

        System.out.println("Array by user: \n");

        // Making array by user  and also take size
        // this take size of 4byte in memory. because it is an int and int has 4byte memory size
        int size=sc.nextInt();
        int mar[]=new int[size];  // it print 0

        for (int i=0;i<size;i++){
            System.out.println(mar[i]);
        }

        //Float
        // this take size of 4byte in memory. because it is a float and float has 4byte memory size

        System.out.println("FLOAT");
        int s=sc.nextInt();
        float m[]=new float[s]; // it print 0.0

        for (int i=0;i<s;i++){
            System.out.println(m[i]);
        }

        //String
        System.out.println("String");
        int si=sc.nextInt();

        
        String mi[]=new String[si];  // it print empty string " "
        
        for (int i=0;i<si;i++){
            System.out.println(mi[i]);
        }


        System.out.println("Taking all input by user: \n");
        //this time we also take elements also
        int asize=sc.nextInt();
        int b[]=new int[asize];  // it print 0
//because we dont know the size of the array so we take input by size
        //input
        for(int i=0;i<asize;i++){
            System.out.println("Question: " +i);
            b[i]=sc.nextInt();
        }
        //output
        System.out.println("Ans");

        for (int i=0;i<asize;i++){
            System.out.println(b[i]);
        }



        //Question
        //Take an array as input from the user.Search for a given number x and the index at which it occurs.
        System.out.print("Enter Size of an array:");
        int bsize=sc.nextInt();
        int arr[]=new int[bsize];

        //input array index
        for(int i=0;i<bsize;i++){
            System.out.println("Enter value"+i);
            arr[i]=sc.nextInt();
        }
        //Taking x
        System.out.println("Enter x: ");
        int o=sc.nextInt();

        System.out.println("Length of an array: "+arr.length);    // .length is used to check length of the array
        
        //outer loop
        for(int i=0;i<arr.length;i++){   // insted of .length we can also write our size which is bsize
            
            if(arr[i]==o){
                System.out.println("x found in index: Array"+ i);
            }
        }
        // <3... 

        


    }
}
