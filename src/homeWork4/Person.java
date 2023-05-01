package homeWork4;

public class Person {
    private String name;
    private String secondName;

    public Person(String name, String secondName) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }



}