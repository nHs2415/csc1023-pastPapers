public class Location {
    private String locationName;
    private double locationDistance;
    public Location(String locationName,double locationDistance){
        this.locationName=locationName;
        this.locationDistance=locationDistance;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(double locationDistance) {
        this.locationDistance = locationDistance;
    }
    public void searchByDistance(){

    }
}
