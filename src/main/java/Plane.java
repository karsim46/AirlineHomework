public class Plane {

    private PlaneType type;
    private int capacity;
    private double weight;

    public Plane(PlaneType planeType, int capacity, double weight) {
        this.weight = weight;
        this.type = planeType;
        this.capacity = capacity;

    }



    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public PlaneType getType() {
        return type;
    }


}



