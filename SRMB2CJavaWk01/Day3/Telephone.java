abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    void lift() {
        System.out.println("lift");
    }

    void disconnected() {
        System.out.println("disconnected");
    }
}
class Main {
    public static void main(String args[]) {
        SmartTelephone st = new SmartTelephone();
        st.lift();
        st.disconnected();
    }
}



