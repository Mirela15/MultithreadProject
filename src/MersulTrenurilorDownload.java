import java.text.DateFormat;
import java.util.Date;

public class MersulTrenurilorDownload {


    public static void main(String[] args) {



        int dataMersulTrenurilr=1;

        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(new MersulTrenurilor(i));
            System.out.println("Data de plecare & sosire a trenurilor! " + dataMersulTrenurilr + " .02.2023");
            dataMersulTrenurilr++;
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }}
