public class Location {

    private String name;
    private double latitude;
    private  double longitude;

    public Location(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getName() {
        return name;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public boolean isNorthernHemisphere(){
        return this.latitude >=0;
    }
    public boolean equals(Object o){
        if(o instanceof Location){
            Location other = (Location)o;
            return this.name.equals(other.name) &&
                    this.latitude == other.latitude &&
                    this.longitude == other.longitude;
        }else{
            return false;
        }
    }
    public String toString(){
        return name + " (" + latitude + ", " + longitude + ")";
    }
    public int hashCode(){
        return this.name.hashCode() ^
                new Double(this.longitude).hashCode() ^
                new Double(this.latitude).hashCode();
    }
}
