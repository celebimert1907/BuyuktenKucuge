package BuyuktenKucugeSiralama;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        float a ,b,c;

        Scanner input = new Scanner(System.in);


        System.out.print("a sayisini giriniz : ");
        a = input.nextInt();

        System.out.print("b sayisini giriniz : ");
        b = input.nextInt();

        System.out.print("c sayisini giriniz : ");
        c = input.nextInt();


        if ((a>b) && (a>c)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if ((b>a) && (b>c)){
            if (a>c){
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");
            }
        } else  if ((c>a)&&(c>b)){
            if (a>b){
               System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}
