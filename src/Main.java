import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   System.out.println(shouldWakeUp (true, 1));
   System.out.println(shouldWakeUp (false, 2));
   System.out.println(shouldWakeUp (true, 8));
   System.out.println(shouldWakeUp (true, -1));
   System.out.println("-------");
   System.out.println(hasTeen(9, 99, 19));
   System.out.println(hasTeen(23, 15, 42));
   System.out.println(hasTeen(22, 23, 34));
   System.out.println("-------");
   System.out.println(isCatPlaying(true, 10));
   System.out.println(isCatPlaying(false, 36));
   System.out.println(isCatPlaying(false, 35));
   System.out.println("-------");
   System.out.println(area(5.0, 4.0));
   System.out.println(area(-1.0, 4.0));
   System.out.println("------------------");
   System.out.println("RECTANGLE CALCULATION");
   Scanner scan = new Scanner(System.in);
   System.out.println("please give a value 1");
   double value1=scan.nextDouble();
   System.out.println("please give a value 2");
   double value2 = scan.nextDouble();
   System.out.println("Alan:" + area(value1,value2));
   System.out.println("------------------");
   System.out.println("please give a value for radius");
   double value3 = scan.nextDouble();
   System.out.println(area(value3));



    }

    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (barking) {
            if (hour < 0 || hour > 23) {
                return false;
            } else return hour < 8 || hour >= 20;
        }
        return false;
    }

    public static boolean hasTeen(int yas1,int yas2,int yas3){
    return yas1 > 13 && yas1 <= 19 || yas2 > 13 && yas2 <= 19 || yas3 > 13 && yas3 <= 19;
    }

    public static boolean isCatPlaying (boolean summer , int tem){
       if(!summer) return tem >=25 && tem <=35;
       else return tem >35 && tem <45;
    }

    public static double area (double db1 , double db2){
    if(db1 <0 || db2 <0) {
        System.out.println("You must give a positive integer!");
        return -1 ;
    }
    return db1 * db2;

    }
    public static double area(double radius) {
        if(radius <0) {
            System.out.println("You must give a positive integer!");
            return -1;
        }
        return radius*radius*Math.PI;
    }
}