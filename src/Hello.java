/**
 * Created with IntelliJ IDEA.
 * User: NShapova
 * Date: 10.08.12
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;

public class Hello {
    public static void main(String[] args)throws IOException{
        String textw="nkjnjol";
        File file=new File("data.txt");
        //FileWriter ne=new File("C:\\Users\\"+"%USERNAME%"+"\\Desktop\\data.txt","hello" );
        //FileWriter write=new FileWriter("C:\\Users\\"+"%USERNAME%"+"\\data.txt");
        String pathfile="C:\\Temp\\";
        file.createNewFile();

        //FileWriter newew=new FileWriter(pathfile,false);
        System.out.print("\nHello WORRRRLLLLLLLDDDDD");
        //Writer output=null;
        //String dirName="C:/Temp";
        //File file = new File(dirname+"write.txt");
        //output=new BufferedWriter(new FileWriter(dirName));
        //output.write(text);
        //output.close();
        //System.out.print("File has been written");
    }
}
