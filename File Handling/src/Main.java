import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import static jdk.jfr.internal.SecuritySupport.newFileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            File fo = new File("newfile.txt");
            fo.createNewFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("newfile.txt");
            fw.write("Lalit ");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        try {
//            BufferedReader br = new BufferedReader(newFileReader("newfile.txt"));
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            File fo = new File("Random.txt");
            fo.createNewFile();
            if (fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}