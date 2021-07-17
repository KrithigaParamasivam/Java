interface Method{
    Hello display(String say);
}
class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}
public class MethodConstructor {
    public static void main(String[] args) {
        //Method reference to a constructor
        Method ref = Hello::new;
        ref.display("Hello World!");
    }
}