package FilesExs_10;

import java.io.*;

public class FileStreamIO {
    public static void main(String[] args) {
        try(FileInputStream reader=new FileInputStream("C:\\Users\\артем\\Music\\look.com.ua-123031.jpg");
            FileOutputStream writer = new FileOutputStream("a.jpg")
        ) {
            int line;
            while((line= reader.read())!=-1){
                writer.write(line);

            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
