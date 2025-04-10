package Exercises;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len;
        System.out.print(" Length :");
        len=scanner.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter your numbers :");
        for (int i=0; i<len; i++){
            nums[i]=scanner.nextInt();
        }
        int max=nums[0];
        int min=nums[0];
        for (int i=1; i<len; i++){
            if (nums[i]>max) max=nums[i];
            if (nums[i]<min) min=nums[i];
        }
        int shift=-min;
        int[] numbers=new int[max-min+1];

        for (int i=0; i<len; i++){
            numbers[nums[i]+shift]++;
        }
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]!=0)
                System.out.println("Number "+(i-shift)+ " appears " +numbers[i]+ ((numbers[i]==1)?" time.":" times."));
        }
    }
}
