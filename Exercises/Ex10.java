package Exercises;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] r=new int[5];
        String[] candList={"a","b","c","d","e"};
        int n=0;
        String ch;
        Scanner scanner=new Scanner(System.in);


        while (n<25){
            for (int i=0; i<5; i++){
                System.out.print( i+1 +":" );
                ch=scanner.next();

                switch (ch){
                    case "a":
                        r[0]+=5-i;
                        break;
                    case "b":
                        r[1]+=5-i;
                        break;
                    case "c":
                        r[2]+=5-i;
                        break;
                    case "d":
                        r[3]+=5-i;
                        break;
                    case "e":
                        r[4]+=5-i;
                        break;
                }
            }
            System.out.println("----------------");
            for (int a=0; a<r.length; a++)
                System.out.println(candList[a] + " : " + r[a]);
            System.out.print("----------------");
            System.out.println();
            n++;
        }
        int max=r[0],x=0;
        for (int i=1; i<5; i++)
            if (r[i]>max) max=r[i];
        for (int i=0; i<5; i++){
            if (r[i]==max)System.out.println("At the end, "+candList[i]+" is winner with "+max+" points");
        }
    }
}
