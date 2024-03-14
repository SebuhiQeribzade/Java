package Task;

public class Task3 {
    private String name;
    private int age;

    public Task3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Task3 person = new Task3("John Doe", 30);
        System.out.println(person); // Calls toString() implicitly
    }
}