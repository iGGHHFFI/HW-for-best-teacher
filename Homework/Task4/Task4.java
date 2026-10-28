package Homework.Task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int summ = 0;
        while (number > 0) {
            int d = number%10;
            summ += d;
            number = number / 10;
        }

        System.out.println(summ);




    }










}
