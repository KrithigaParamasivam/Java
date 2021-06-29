import java.io.*;
class FileOp
{
    public static void p(String str)
    {
        System.out.println(str);
    }
    public static void analyze(String s){
    File f=new File(s);

 if(f.exists())
    {   System.out.println(f.exists());
        System.out.println(f.getName()+" is a file");
        System.out.println(f.canRead()?" File is readable":" is not readable");
        System.out.println(f.canWrite()?" File is writable":" is not writable");
        System.out.println("Filesize:"+f.length()+" bytes");

    }
}

}
public class FileDetails
{
    public static void main(String rr[])throws IOException
    {
        FileOp fd=new FileOp();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file path:");
        String s=br.readLine();
        fd.analyze(s);
    }
}