package org.example;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 3);

        StringArray stringArray = new StringArray();

        Double[] array = new Double[]{12.0, 15.0, 16.0};
        Vector v = new Vector(array);
        Double[] array1 = new Double[]{12.0, 15.0, 14.0};
        Vector v1 = new Vector(array1);

        DeveloperFactory dev = new DeveloperFactory();

        Scanner sc = new Scanner(System.in);
        System.out.print("Выберете задание: ");
        int choice = sc.nextInt();
        switch ( choice){
            case 1:
                System.out.println(p1.distanceTo(p2));
                System.out.println(p1.toString());
                System.out.println(p2.toString());
                break;
            case 2:
                stringArray.add("12121212112234234");
                stringArray.add("askjdaskdhaskdhaksdhakjsdhaskjdh87y");
                stringArray.add("Java");

                System.out.println(stringArray.getMax());
                System.out.println(stringArray.getAverageLength());
                break;
            case 3:

                System.out.println("\nСкалярное произведение векторов");
                System.out.println(v.vScale(v1));

                System.out.println("\nСложение векторов");
                System.out.println(v.vSum(v1));

                System.out.println("\nВычитание векторов");
                System.out.println(v.vSub(v1).toString());

                System.out.println("\nВекторное произведение");
                System.out.println(v.vCross(v1).toString());

                System.out.println("\nУгол между векторами: ");
                System.out.println(v.vDegree(v1));

                System.out.println("\nДлина вектора v");
                System.out.println(v.vLength(v1));

                System.out.println("\nДлина вектора v1");
                System.out.println(v.vLength(v));

                System.out.println("\nПлощадь параллелограмма, построенного по двум векторам: ");
                System.out.println(v.vSquare(v1));
                break;
            case 4:
                try{
                    System.out.println("-----------------");
                    dev.factory().codding();
                    System.out.println("-----------------");
                    dev.factory().codding();
                    System.out.println("-----------------");
                } catch (Exception e){
                    System.out.println(e);
                }





        }
    }
}