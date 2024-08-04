
public class Employee {

        String firstName;
        int age;
        public Employee(String firstname,int age){
            this.age=age;
            this.firstName=firstname;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
