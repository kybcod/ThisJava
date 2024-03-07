package Check11.ex08;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        /*
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
            fw.write("JAVA");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e){}
        }
         */

        try(FileWriter fw = new FileWriter("file.txt")){
             fw.write("Java");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
