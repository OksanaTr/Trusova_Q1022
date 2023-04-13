package homeWork3;

public class User {
    public enum EnumUser {
        USER1(name:"Anna", lastname:"Smirnova", age:18, gender:"F"
        USER2 {name: "Maks", lastname: "Dubov", age: 36, gender:"M"};
        USER 3 (name: "Mariya", lastname: "Ivanova", age: 28, gender:"F");
        USER 4 (name:"Ivan", lastname:"Klimov", age: 24, gender "M"),


        private String Name;
        private String LastName;
        private int age;
        private String gender;

        void USER (String Name, String lastName, int age, String gender) {
            this.Name = Name;
            this.LastName = lastName;
            this.age = age;
            this.gender = gender;
        }
        public void printNameAndLastName(){
            System.out.println( Name+ "" + LastName);

        }}}
