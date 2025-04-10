package Exercises;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random=new Random();
        int x;
        int heads=0,tails=0;

        for (int i=0; i<1000; i++){
            x=random.nextInt(2);

            if (x==0)
               heads++;
            else
                tails++;
        }
        System.out.println("shir : "+(double)heads/1000);
        System.out.print("khat : "+(double)tails/1000);
    }
}
