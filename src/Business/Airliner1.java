package Business;

public class Airliner1 {

    private String airlineName;
    private AirlinerDirectory airlinerDirectory;

    private CustomerDirectory customerDirectory;

    public Airliner1() {
        airlinerDirectory = new AirlinerDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }  

    @Override
    public String toString() {
        return airlineName;
    }
}
