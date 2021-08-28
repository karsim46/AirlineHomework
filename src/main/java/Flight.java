import java.util.ArrayList;

public class Flight extends Pilot{

    private Plane plane;
    private Pilot pilot;

    private String flightNumber;
    private String destination;
    private String destinationAirport;
    public String deptTime;
    private ArrayList<Passenger>passengers;



    public Flight(Plane plane, String flightNumber, String destination, String destinationAirport, String deptTime, Pilot pilot){
        super("Bruce Dickinson","Pilot","IRMA666");
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destinationAirport = destinationAirport;
        this.deptTime = deptTime;
        this.passengers = new ArrayList<>();
    }
    public Plane getPlane(){
        return plane;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination() {return destination;}


    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDeptTime(){
        return deptTime;
    }

    public Pilot getPilot(){
        return pilot;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public int getNumberOfPassengers(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }



}