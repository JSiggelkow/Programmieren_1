package lerneinheiten.files;

/**
 * Person
 *
 * @author Jonas Siggelkow
 *
 */
public class Person {
    private final String name;
    private final char gender;
    private int age;

    public Person(String name, char gender , int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
