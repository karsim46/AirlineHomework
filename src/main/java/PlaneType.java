public enum PlaneType {
    BOEING747("Boeing 747", 10.000, 250 );


    private final String model;
    private final Double weight;
    private final Integer capacity;

    PlaneType(String model, Double weight, int capacity){
        this.model = model;
        this.weight = weight;
        this.capacity = capacity;
    }

    public String getModel(){
        return this.model;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Integer getCapacity() {return this.capacity;}
    }

