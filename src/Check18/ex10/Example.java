package Check18.ex10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception{
//       "Temp/dir1/dog.png","Temp/dir2/dog2.png"

        Scanner scanner = new Scanner(System.in);

        System.out.print("원본 파일 경로 : ");
        String fileName = scanner.nextLine();

        System.out.print("복사 파일 경로 : ");
        String copyFileName = scanner.nextLine();

        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("원본 파일이 존재하지 않습니다.");
        }else{
            File copyfile = new File(copyFileName);
            File parentFile = copyfile.getParentFile();
            if(!parentFile.exists()){
                parentFile.mkdirs();
            }

            try (InputStream is = new FileInputStream(fileName);
                 OutputStream os = new FileOutputStream(copyFileName);
                 BufferedInputStream bis = new BufferedInputStream(is);
                 BufferedOutputStream bos = new BufferedOutputStream(os);){

                byte[] data = new byte[1024];
                int len = 0;
                while((len = bis.read(data)) != -1){
                    os.write(data, 0, len);
                }
                System.out.println("복사가 성공되었습니다.");
            } catch (IOException e){
                e.printStackTrace();
            }

        }





    }
}
