import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; // declearing array
        for(int i=0;i<n;i++) arr[i] = sc.nextInt(); // taking array input
        for(int i=0;i<n;i++) System.out.println(arr[i]); // printing array input
        sc.close(); 
    }
}