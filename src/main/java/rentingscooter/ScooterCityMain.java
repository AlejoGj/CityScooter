package rentingscooter;


import rentingscooter.domain.PickUpPoint;
import rentingscooter.domain.Scooter;
import rentingscooter.services.PickUpPointServiceImpl;
import rentingscooter.services.ScooterSeviceImpl;
import rentingscooter.view.PickupPointView;
import rentingscooter.view.ScooterView;

public class ScooterCityMain {
    public static void main(String[] args) {

        ScooterSeviceImpl scooterSeviceImpl = new ScooterSeviceImpl();

        Scooter scooter = new Scooter();

        PickUpPoint pickUpPoint = new PickUpPoint();

        PickUpPointServiceImpl pickUpPointService = new PickUpPointServiceImpl();

        ScooterView scooterView = new ScooterView(scooterSeviceImpl, scooter, pickUpPoint);
        PickupPointView pickupPointView = new PickupPointView(pickUpPoint, pickUpPointService);

        pickupPointView.createPickupPointView();
        pickUpPointService.createPickupPoint(pickUpPoint);
        scooterView.createScooterView();
        scooterSeviceImpl.printScooter(scooter);


    }
}
