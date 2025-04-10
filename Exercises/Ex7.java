package Exercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length of arrays :");
        int len=scanner.nextInt();
        int[] arr1=new int[len];
        System.out.println("Enter components of array1 :");
        for (int i=0; i<len; i++){
            arr1[i]=scanner.nextInt();
        }
        int[] arr2=new int[len];
        System.out.println("Enter components of array2 :");
        for (int i=0; i<len; i++){
            arr2[i]=scanner.nextInt();
        }
        boolean flag=true;
        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                if (arr1[i]==arr2[j]){
                    flag=true;
                break;
                }
                else
                    flag=false;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
