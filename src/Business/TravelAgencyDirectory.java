package Business;

import java.util.ArrayList;
import java.util.List;

public class TravelAgencyDirectory {

    private ArrayList<Airliner1> TravelAgencyDirectory;

    public TravelAgencyDirectory() {
        TravelAgencyDirectory = new ArrayList<Airliner1>();
    }

    public ArrayList<Airliner1> getTravelAgencyDirectory() {
        return TravelAgencyDirectory;
    }

    public Airliner1 addTravelAgency() {
        Airliner1 ta = new Airliner1();
        TravelAgencyDirectory.add(ta);
        return ta;
    }

    public void removeTravelAgency(Airliner1 ta) {
        TravelAgencyDirectory.remove(ta);
    }

}
