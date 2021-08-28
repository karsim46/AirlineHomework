public enum PlaneType {
    BOEING747("Boeing 747", 10000.00, 524 );


    private final String type;
    private final Double weight;
    private final int capacity;

    PlaneType(String type, Double weight, int capacity){
        this.type = type;
        this.weight = weight;
        this.capacity = capacity;
    }

    public String getType(){
        return type;
    }

    public Double getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;}
    }

