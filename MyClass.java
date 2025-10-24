public class MyClass {
    private String name;
    
    public MyClass(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
    
    // НОВЫЙ МЕТОД
    public String getName() {
        return name;
    }
}