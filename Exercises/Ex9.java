package Exercises;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] candList={"a","b","c","d","e"};
        int[] candCnt=new int[5];

        for (int i=0; i<25; i++){
            System.out.print("Enter your candidates : ");
            String ch=scanner.next();
            switch (ch){
                case "a":
                    candCnt[0]++;
                    break;
                case "b":
                    candCnt[1]++;
                    break;
                    case "c":
                        candCnt[2]++;
                    break;
                    case "d":
                        candCnt[3]++;
                    break;
                    case "e":
                        candCnt[4]++;
                    break;
            }
        }
        for (int i=0; i<5; i++)
            System.out.println("R "+candList[i]+" : "+candCnt[i]);
    }
}
