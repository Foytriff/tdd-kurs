package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utils {

    private String name;
    private int age;

    public Utils(int age, String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utils utils = (Utils) o;
        return age == utils.age && Objects.equals(name, utils.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
