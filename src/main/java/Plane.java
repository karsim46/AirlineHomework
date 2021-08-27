public class Plane {
    private int capacity;
    private double weight;
    private String model;

    public Plane(int capacity, double weight, String model) {
        this.capacity= capacity;
        this.weight = weight;
        this.model = model;
    }


    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }


}



