package FilesExs_10;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    /*
    *Робото осуществляеться потоком
    *apend - значит то что можно добавлять информацию в файл
    * */
    public static void main(String[] args) throws IOException{
        String s="Мишка косолапый\n" +
                "По лесу идет,\n" +
                "(Бодро шагаем)\n" +
                "Шишки собирает,\n" +
                "Песенки поет.\n" +
                "( Приседаем - собираем шишки)\n";

        FileWriter writer = null;
        try {
            writer =new FileWriter("task2.txt",true); //apend
            for (int i = 0; i < s.length(); i++) { //1 swposob
                writer.write(s.charAt(i));
            }

            writer.write(s);                   //2
        } catch (IOException e) {
            e.printStackTrace();
        }
    finally {
            writer.close();
        }

    }
}
