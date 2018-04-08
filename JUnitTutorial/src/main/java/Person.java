
public class Person {
    private String preName;
    private String lastName;
    private int age;
    
    public Person(String preName, String lastName, int age) {
        this.preName = preName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getName() {
        return preName + " " + lastName;
    }
    
    public int getAge() {
        return age;
    }
    
}
