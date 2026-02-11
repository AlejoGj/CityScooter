package rentingscooter.domain;

import java.util.Date;

public class Scooter extends Vehicle {

    private float engineCapacity;
    private double pricePerHour;
    private Date lastMaintenanceDate;
    private PickUpPoint pickUpPoint;

    public Scooter(int idVehicle, String brand, String model, String color, int paxCapacity, String reference, String plate, boolean availableForRent, float engineCapacity, double pricePerHour, Date lastMaintenanceDate, PickUpPoint pickUpPoint) {
        super(idVehicle, brand, model, color, paxCapacity, reference, plate, availableForRent);
        this.engineCapacity = engineCapacity;
        this.pricePerHour = pricePerHour;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.pickUpPoint = pickUpPoint;
    }

    public Scooter () {
        super();
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Date getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public PickUpPoint getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(PickUpPoint pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "engineCapacity=" + engineCapacity +
                ", pricePerHour=" + pricePerHour +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", pickUpPoint=" + pickUpPoint +
                '}';
    }
}
