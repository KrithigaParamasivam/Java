public class Obj2
{
    public String name;
    public long population;

    public void display()
    {
        System.out.println("City name: " +name);
        System.out.println("Population: " +population);
    }
    public static void main(String args[])
    {

        Obj2 city1 = new Obj2();
        Obj2 city2 = new Obj2();
        city1.name ="Delhi";
        city1.population = 10000000;
        System.out.println("Details of city 1:");
        city1.display();
        city2.name ="Bangalore";
        city2.population = 5000000;
        System.out.println("Details of city 2:");
        city2.display();
    }
}