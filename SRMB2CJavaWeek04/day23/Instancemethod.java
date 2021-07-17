interface MyInterface{
    void display();
}
public class Instancemethod {
    public void myMethod(){
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        Instancemethod obj = new Instancemethod();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();
    }
}