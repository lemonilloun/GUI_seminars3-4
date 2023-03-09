package org.example;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloper extends Developer{

    public JavaDeveloper(String name, String rang, int wExp, List<String> technics) {
        super(name, rang, wExp, technics);
    }

    @Override
    protected void codding() {
        System.out.println("Java Developer");
        System.out.println("Начинаю писать код...");
        System.out.print("Применяю технологии: ");
        for (String x: technics) {
            System.out.print(x + "; ");
        }
        System.out.println("");

    }
}
