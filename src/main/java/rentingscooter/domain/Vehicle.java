package rentingscooter.domain;

public class Vehicle {

    private int idVehicle;
    private String brand;
    private String model;
    private String color;
    private int paxCapacity;
    private String reference;
    private String plate;
    private boolean availableForRent;

    public Vehicle(int idVehicle, String brand, String model, String color, int paxCapacity, String reference, String plate, boolean availableForRent) {
        this.idVehicle = idVehicle;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.paxCapacity = paxCapacity;
        this.reference = reference;
        this.plate = plate;
        this.availableForRent = availableForRent;
    }

    public Vehicle() {
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaxCapacity() {
        return paxCapacity;
    }

    public void setPaxCapacity(int paxCapacity) {
        this.paxCapacity = paxCapacity;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isAvailableForRent() {
        return availableForRent;
    }

    public void setAvailableForRent(boolean availableForRent) {
        this.availableForRent = availableForRent;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idVehicle=" + idVehicle +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", paxCapacity=" + paxCapacity +
                ", reference='" + reference + '\'' +
                ", plate='" + plate + '\'' +
                ", availableForRent=" + availableForRent +
                '}';
    }
}
