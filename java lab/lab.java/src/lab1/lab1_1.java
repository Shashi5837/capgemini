package lab1;

import java.util.Scanner;

public class lab1_1 {
    static int calculatesum(int N,int X, int Y){
        int S1,S2,S3;
        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
        S3 = ((N / (X * Y))) * (2 * (X * Y)+ (N / (X * Y) - 1) * (X * Y))/ 2;

        return S1+S2-S3;
        
    }
   
    public static void main(String[] args) {   
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter n value");
        int N=sc.nextInt() ;  
      //int N=20;
      int X=3;
      int Y=5;
      System.out.println(calculatesum(N,X,Y));
    }
}
