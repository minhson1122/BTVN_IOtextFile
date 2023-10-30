package TinhTongCacSoTrongFile;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExample(String filePath){
            try {
                File file = new File(filePath);
                if (!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = bufferedReader.readLine()) != null ){
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                bufferedReader.close();
                System.out.println("Tổng =" + sum);
            } catch (Exception e) {
                System.err.println("File không tồn tại hoặc nội dung có lỗi");
            }
        }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(path);
    }
    }


