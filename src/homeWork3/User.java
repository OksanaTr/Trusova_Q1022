package homeWork3;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    public User (String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String getFullName() {
        return lastName+""+firstName;
    }
    public int getAge() {
        return age;
    }
    public void increaseAge() {
        age++;
    }
    public void println(){
        System.out.println("Name: " + firstName + "" + lastName);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+gender);
    }
    public enum Gender{
        MALE,
        FEMALE
    }
}
