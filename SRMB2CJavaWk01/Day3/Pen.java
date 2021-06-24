abstract class Pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen{
    void write(){
        System.out.println(Write);
    }
    void refill(){
        System.out.println(Refill);
    }
    void changeNib(){
        System.out.println(Changing the nib);
    }
}

class PenClass{
    public static void main(String args[]){
        FountainPen p=new FountainPen();
        p.write();
        p.refill();
        p.changeNib();

    }
}