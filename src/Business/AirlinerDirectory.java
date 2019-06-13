package Business;

import java.util.ArrayList;
import java.util.List;

public class AirlinerDirectory {

    private ArrayList<Flight> airlinerDirectory;

    public AirlinerDirectory() {
        airlinerDirectory = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public Flight addAirline() {
        Flight newAirline = new Flight();
        airlinerDirectory.add(newAirline);
        return newAirline;
    }

    public void deleteAirline(Flight airliner) {
        airlinerDirectory.remove(airliner);
    }

    public List<Flight> getAirlineList(String source, String destination) {
        List<Flight> airlineList = new ArrayList<>();
        System.out.println(airlinerDirectory);

        for (Flight aa : this.airlinerDirectory) {

            if (aa.getSource() == source || aa.getDestination() == destination) {
                airlineList.add(aa);
            }
        }
        return airlineList;
    }
}
