import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class MyScanner {
    MyScanner(File source) throws IOException {
        FileReader fileReader = new FileReader(source);
        BufferedReader buffReader = new BufferedReader(fileReader);
        String line;
        while((line = buffReader.readLine()) != null){
            System.out.println(line);
        }
        buffReader.close();
        fileReader.close();
    }

    MyScanner(InputStream source) throws IOException {
        int buffSize = 1024;
        char buff[] = new char[buffSize];
        
        Reader reader = new BufferedReader(new InputStreamReader(source));
        int read = reader.read(buff);
        while (read >= 0) {
            read = reader.read(buff);
        }

        reader.close();
    }

}
