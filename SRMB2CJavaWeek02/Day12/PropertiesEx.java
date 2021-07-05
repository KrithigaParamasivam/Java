import java.util.*;
import java.io.*;
    public class PropertiesEx  {
        public static void main(String[] args)throws Exception{
           FileReader reader=new FileReader("C:\\Users\\Dell\\IdeaProjects\\java programs rightstroke\\day12\\src\\pp.properties");
           // FileReader reader=new FileReader("D:\\File\\pp.properties");
            Properties p=new Properties();
            p.load(reader);
            System.out.println("Property1");
            System.out.println("==========");
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("password"));

            System.out.println("==========");
            System.out.println("Property2");
            System.out.println("==========");
            p.setProperty("name","krithiga");
            p.setProperty("email","kk@gmail.com");
            p.setProperty("subject","java");
            p.setProperty("topic","properties");
            p.store(new FileWriter("D:\\File\\pro.properties"),"Properties Example");

            System.out.println(p.getProperty("name"));
            System.out.println(p.getProperty("email"));
            System.out.println(p.getProperty("subject"));
            System.out.println(p.getProperty("topic"));
        }
    }

