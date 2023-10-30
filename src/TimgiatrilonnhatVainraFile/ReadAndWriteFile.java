package TimgiatrilonnhatVainraFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        {
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) != null) {
                    number.add(Integer.parseInt(line));
                }
                br.close();
            } catch (IOException e) {
                System.err.println("File không tồn tại hoặc nôi dụng có lỗi");
            }
        }
        return number;
    }

        public void writeFile(String filePath,int max){
            try {
                FileWriter fileWriter = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Giá trị lớn nhất là" + max);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

