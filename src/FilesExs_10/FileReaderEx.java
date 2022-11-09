package FilesExs_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    // reader возвращает int
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try {
            int charter;
            reader=new FileReader("task2.txt");
            while((charter=reader.read())!=-1)
                System.out.print((char)charter);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally{
            reader.close();
        }
    }
}
