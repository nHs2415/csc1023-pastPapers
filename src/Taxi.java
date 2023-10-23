public class Taxi {
    private String taxiId;
    private int numOfPassengers;
    public Taxi(String taxiId,int numOfPassengers){
        this.taxiId=taxiId;
        this.numOfPassengers=numOfPassengers;
    }

    public String getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(String taxiId) {
        this.taxiId = taxiId;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
    public static Taxi[] getMaxNumberOfPassengers()
}
