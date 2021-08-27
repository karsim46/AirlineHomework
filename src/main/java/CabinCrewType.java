public enum CabinCrewType {

    COOPILOT("Steve Harris", "Co-Pilot"),
    FIRSTOFFICER("Nicko Mcbrain", "1st Officer"),
    FLIGHTATTENDANT("Adrian Smith", "Flight Attendant"),
    PURSER("Dave DiAnno", "Purser"),
    STEWARD("Dave Murray", "Steward");

    private final String name;
    private final String rank;

    CabinCrewType(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public String getRank() {
        return rank;
    }
}


