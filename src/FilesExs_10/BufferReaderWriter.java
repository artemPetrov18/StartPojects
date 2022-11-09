package FilesExs_10;

import java.io.*;

public class BufferReaderWriter {

    /*
    * Буферезация - это типо как в ютубе когда прогружаеться видео по частям
    * BufferReader- выделяеться какойто буфер(часть памяти) и за первое обращение буфер заполняеться, в
    * то время как File reader каждый раз обращяеться к файлу
    *
    * BufferWriter - помещает в буфер нужные данные и записует его
    *
    *
    * */

    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("task2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("task3.txt"))
        ) {
            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
                writer.write('\n');
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
