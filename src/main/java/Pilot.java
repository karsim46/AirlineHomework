
public class Pilot extends Plane{
    private final String name;
    private final String rank;
    private final String pilotLicenseNumber;



    public Pilot(String name, String rank, String pilotLicenseNumber) {
        super(PlaneType.BOEING747,524,10000.00);
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public String flyThePlane(Flight flight){
        Plane plane = flight.getPlane();
        return String.format("Flying %s to %s leaving from %s", plane.getType(), flight.getDestination(), flight.getDestinationAirport());
    }
}