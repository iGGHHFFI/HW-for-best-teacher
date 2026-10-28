package Homework_N2;
import  java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цену");
        double cost = in.nextDouble();
        System.out.println("Введите регион");
        double region = in.nextDouble();
        if (cost < 5000 && cost > 0) {
            if(region == 1){
                System.out.println("Доставка буржуям не положена, тащи сам или 5кк злотых");
            } else if (region == 2) {
                System.out.println("Доставка 350");
            }else if (region ==3){
                System.out.println("Доставка 700");
            }
        }
        else if (cost<0) {
            System.out.println("ERROR");
        } else{
            System.out.println("Цена доставки 0");
        }
    }
}