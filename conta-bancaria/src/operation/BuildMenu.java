package operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuildMenu {

    public static void buildMenu() {

        try {
            String filePath = "E:\\IdeaProjects\\dio-trilha-java-basico\\conta-bancaria\\resources\\menu.txt";

            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
