import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestProgram {

    // public static void ReadInPath(String fileName) throws FileNotFoundException {
    //     Path path = Paths.get(fileName);
    //     MyScanner my_scanner = new MyScanner(path);

    // }

    public static void ReadInFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        //MyScanner my_scanner = new MyScanner(file);
    }
    
    public static void ReadInStream(String fileName) throws IOException{
        MyScanner my_scanner = new MyScanner(System.in);
    }

    public static void main(String[] args) throws IOException {
        // if(args.length == 0) {
        //     ReadInConsole();
        // } else {
        //     ReadInFile();
        // }   

        //MyScanner scanner;
        
        //Scanner scn = new Scanner(S);
        String fileName;
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader buffReader = new BufferedReader(inputReader);
        
        fileName = buffReader.readLine();
        System.out.println(fileName);


        inputReader.close();
        buffReader.close();
            
    }
   
}
