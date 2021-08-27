import java.util.ArrayList;

public class Flight extends Pilot{

    private String flightNumber;
    private String destination;
    private String destinationAirport;
    private String departureTime;
    private ArrayList<String>passengers;
    private ArrayList<Integer>cabinCrewMembers;



    public Flight(String name, String rank, String pilotLicenseNumber, String flightNumber, String destination, String destinationAirport, String departureTime) {
        super(name, rank, pilotLicenseNumber);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>(5);


    }
}


