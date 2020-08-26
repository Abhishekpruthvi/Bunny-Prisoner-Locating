package src;

import java.util.Scanner;

public class BunnyPrisonerLocating {

    private static String solution(long x, long y) {
        // your code here
        long row = x+y;
        long firstNumber = 1;
        for(long i=1;i<=row; i++) {
            firstNumber+=i;
        }
        long sub=row;
        String result ="";
        for(long i=0; i<row; i++) {
            long add = row-i+1;
            long requiredNumber = firstNumber;
            for(long j=0; j<=i; j++) {
                if(j==0) {
                    firstNumber-=sub--;
                    requiredNumber=firstNumber;
                }else {

                    requiredNumber=requiredNumber+add++;
                }
                if(i==x && j==(row-(y+1))) {
                    result = requiredNumber+"";
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of x");
        long x = scan.nextLong();
        System.out.println("Enter value of y");
        long y = scan.nextLong();
        System.out.println("Prisoner located at \n"+solution(x,y));
    }
}

