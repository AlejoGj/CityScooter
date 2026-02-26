package rentingscooter.view;

import rentingscooter.domain.PickUpPoint;
import rentingscooter.services.PickUpPointServiceImpl;
import rentingscooter.services.PickupPointService;
import rentingscooter.utilities.ConsoleReader;

import java.sql.Struct;
import java.util.Scanner;

import static rentingscooter.utilities.ConsoleReader.*;

public class PickupPointView {

    private final PickUpPoint pickUpPoint;
    private final PickupPointService pickupPointService;

    public PickupPointView (PickUpPoint pickUpPoint, PickUpPointServiceImpl pickupPointService) {
        this.pickUpPoint = pickUpPoint;
        this.pickupPointService = pickupPointService;
    }

    public void createPickupPointView() {

        System.out.println("Ingrese el id del punto de recogida");
        int idPickupPoint = sc.nextInt();
        pickUpPoint.setIdPickupPoint(idPickupPoint);
        sc.nextLine();


        System.out.println("Ingrese el nombre del punto de recogida");
        String pointName = sc.nextLine();
        pickUpPoint.setPointName(pointName);
        System.out.println("Ingrese la ubicacion del punto de recogida");
        String ubication = sc.nextLine();
        pickUpPoint.setLocation(ubication);
        System.out.println("Ingrese si el punto de recogida esta activo para renta (true/false): ");
        boolean isActive = sc.nextBoolean();
        pickUpPoint.setActive(isActive);


        pickupPointService.createPickupPoint(pickUpPoint);


    }
}
