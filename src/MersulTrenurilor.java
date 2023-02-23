import java.time.MonthDay;
import java.util.Date;

public class MersulTrenurilor implements Runnable {
 int days;
    public MersulTrenurilor(int days){
       this.days=days;
    }

    String[] infoDeparture = {"Plecare la 5:40 București Nord -> ", "Plecare la 6:09 Craiova -> Cluj Napoca",
            "Plecare la 13:20 București Nord-> Oradea"};
    String[][] infoArrive = {{"Sosire la 08:52 București Nord->Craiova", "Sosire la 11:13 București Nord->Severin",
            "Sosire la 13:49 București Nord->Arad "}, {"Sosire la 8:23 Drobeta-Turnu-Severin", "Sosire la 11:35 Timisoara", "Sosire la 16:45 Oradea"},
            {"Sosire la 15:10 Craiova", "Sosire la 16:45 Drobeta-Turnu-Severin ", "Sosire la 19:10 Timisoara"}};



    @Override
    public void run() {
        for (int i = 0; i < infoDeparture.length; i++) {



            System.out.println(infoDeparture[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int j = 0; j < infoArrive.length; j++) {
                System.out.println(infoArrive[i][j]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }

            System.out.println(" ");



        }

    }
}



