package FilesExs_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Resors {
    public static void main(String[] args) throws IOException {
    // Служит для автоматического закрытия рисурсов
        // по простому просто вместо finally
        try ( FileReader reader=new FileReader("task2.txt")){

            int charter;

            while((charter=reader.read())!=-1)
                System.out.print((char)charter);
        }

    }
}
