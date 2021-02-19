import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CSVHandler {

    private String pathString;
    private ArrayList<String> dateList;
    private ArrayList<String> individualBuyCountList;

    public CSVHandler(String pathString) {
        this.pathString = pathString;
    }

    public void readData() {


        try {
            Path path = Paths.get(this.pathString);
            BufferedReader br = Files.newBufferedReader(path);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
