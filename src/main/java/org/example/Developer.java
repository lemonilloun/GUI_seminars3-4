package org.example;

import java.util.List;

public abstract class Developer {
    protected String name;
    protected String rang;
    protected int wExp;
    protected List<String> technics;

    public Developer(String name, String rang, int wExp, List<String> technics) {
        this.name = name;
        this.rang = rang;
        this.wExp = wExp;
        this.technics = technics;
    }

    protected abstract void codding();

}
