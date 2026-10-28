package Homework.Task2_3;
import java.util.Scanner;
public class Task2_3 {
// ////////////////////////////////////
//Сдача
// ////////////////////////////////////

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int summa = scan.nextInt();
        int polucheno = scan.nextInt();
        int sdacha = polucheno - summa;
        System.out.println(sdacha);

        int a1000 = sdacha/1000;
        int a500 = sdacha%1000/500;
        int a200 = sdacha%1000%500/200;
        int a100 = sdacha%1000%500%200/100;
        int a50 = sdacha%1000%500%200%100/50;
        System.out.printf("Купюрочки: 1000=%d, 500=%d, 200=%d, 100=%d, 50=%d", a1000, a500, a200, a100, a50);

    }







}
