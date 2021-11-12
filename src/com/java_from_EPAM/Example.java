package com.java_from_EPAM;

import java.util.Objects;

public class Example {
    private int i=1;
    private String str="My string";

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Example{\n\t" +
                " i=" + i +
                ",\n\t str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return i == example.i && Objects.equals(str, example.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, str);
    }
}
