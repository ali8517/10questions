package Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numIn;
        System.out.print("Enter yor number : ");
        numIn=scanner.nextInt();

        int digitCnt=0,correctNum=numIn;
        while (correctNum>0){
            correctNum/=10;
            digitCnt++;
        }
        if (digitCnt%2==1){
            System.out.print("The number of digits in the number must be even!");
        }
        else {
            int n1,n2,x1=digitCnt/2,x2=digitCnt/2,cnt1=0,cnt2=0;
            n1= (int) (numIn/Math.pow(10,x1));
            while (x1>0){
                cnt1+=(n1%10);
                n1/=10;
                x1--;
            }

            n2= (int) (numIn%Math.pow(10,x2));
            while (x2>0){
                cnt2+=(n2%10);
                n2/=10;
                x2--;
            }
            if (cnt1==cnt2)
                System.out.println("The sum of the first half of the number is equal to the second half.");
            else
                System.out.println("The sum of the first half of the number is not equal to the second half.");
        }
    }
}
