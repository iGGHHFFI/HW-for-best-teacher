import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Цыфру давай");
        double first = in.nextDouble();
        System.out.println("Следующую давай");
        double Another_one = in.nextDouble();
        System.out.println("Придумай ч делать: / * - + ?");
        String operatsiya = in.next();
        switch (operatsiya){
            case("/"):
                if (Another_one==0) {
                    System.out.println("Error");break;
                }else {
                    System.out.println(first / Another_one);break;
                }
            case ("*"):
                System.out.println(first*Another_one);break;
            case ("-"):
                System.out.println(first-Another_one);break;
            case ("+"):
                System.out.println(first+Another_one);break;
            default:
                System.out.println("Error operation☠️");break;
        }
    }
}
