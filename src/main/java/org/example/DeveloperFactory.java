package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperFactory {
    private List<String> jDev = new ArrayList<>();
    private List<String> pDev = new ArrayList<>();

    public Developer factory(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Создание разработчика: ");
        String name;
        String rang;
        int exp;

        System.out.println("1 - Java Developer; \n2 - Python Developer");
        int c = sc.nextInt();
        switch (c){
            case 1:
                jDev.add("Lists");
                jDev.add("Arrays");
                jDev.add("Some OOP");
                jDev.add("Encapsulation");
                jDev.add("Sprint");
                System.out.println("Введите имя (латиница): ");name = sc.next();
                System.out.println("Введите уровень (Junior, Middle, Senior): ");rang = sc.next();
                System.out.println("Введите опыт работы (в месяцах): ");exp = sc.nextInt();
                Developer javik = new JavaDeveloper(name, rang, exp, jDev);
                return javik;
            case 2:
                pDev.add("print(Hello world)");
                pDev.add("Numpy");
                pDev.add("Pandas");
                pDev.add("Matplotlib");
                System.out.println("Введите имя (латиница): ");name = sc.next();
                System.out.println("Введите уровень (Junior, Middle, Senior): ");rang = sc.next();
                System.out.println("Введите опыт работы (в месяцах): "); exp = sc.nextInt();
                Developer pythonik = new PythonDeveloper(name, rang, exp, jDev);
                return pythonik;
            default:
                return null;

        }
    }



}
