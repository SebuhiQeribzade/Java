package Task;

public class Task2 implements Cloneable {
    private int id;
    private String name;

    public Task2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectExample{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Task2 obj1 = new Task2(1, "John");
        Task2 obj2 = new Task2(2, "Alice");

        // toString() method
        System.out.println("obj1: " + obj1.toString());
        System.out.println("obj2: " + obj2.toString());

        // equals() method
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

        // hashCode() method
        System.out.println("Hash code of obj1: " + obj1.hashCode());
        System.out.println("Hash code of obj2: " + obj2.hashCode());

        // getClass() method
        System.out.println("Class of obj1: " + obj1.getClass());

        // clone() method
        Task2 obj3 = (Task2) obj1.clone();
        System.out.println("Cloned object: " + obj3);
    }
}