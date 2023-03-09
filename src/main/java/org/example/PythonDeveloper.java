package org.example;

import java.util.ArrayList;
import java.util.List;

public class PythonDeveloper extends Developer{
    public PythonDeveloper(String name, String rang, int wExp, List<String> technics) {
        super(name, rang, wExp, technics);
    }

    @Override
    protected void codding() {
        System.out.println("Python Developer");
        System.out.println("Начинаю писать код..");
        System.out.println("Информация о себе: ");
        System.out.println("Имя - " + name);
        System.out.println("Мой уровень - " + rang);
        System.out.println("Стаж - " + wExp + " месяцев");
    }
}
