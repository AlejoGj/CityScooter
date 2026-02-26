package rentingscooter.view;

import rentingscooter.domain.PickUpPoint;
import rentingscooter.domain.Scooter;
import rentingscooter.services.ScooterSeviceImpl;
import rentingscooter.utilities.DateUtil;

import java.util.Date;
import java.util.Scanner;

public class ScooterView {
    private final ScooterSeviceImpl scooterService;
    // le decimos a view que se cominuque con service
    // instancia unica a traves de un patrón de diseño
    private final Scooter scooter;
    private final PickUpPoint pickUpPoint;
    Scanner sc = new Scanner(System.in);


    public ScooterView(ScooterSeviceImpl scooterService, Scooter scooter, PickUpPoint pickUpPoint){
        this.scooterService = scooterService;
        this.scooter = scooter;
        this.pickUpPoint = pickUpPoint;
    } // inyectando la dependencia de scooterServiceImpl por medio del constructor
    /*  3 FORMAS DE INYECTAR DEPENDENCIAS
    *   Pasar un objeto inmutable a traves del ciclo de la app
    *
    *   1. Constructor - Actualmente usando - inicializar los objetos
    *   2. Como argumentos en un método
    *   3. En los setters
    *
    * */

    public void createScooterView() {

        System.out.println("Ingrese el ID del scooter: ");
        int id = sc.nextInt();
        scooter.setIdVehicle(id);
        sc.nextLine();

        System.out.println("Ingrese la marca del scooter: ");
        String brand = sc.nextLine();
        scooter.setBrand(brand);

        System.out.println("Ingrese el modelo: ");
        String model = sc.nextLine();
        scooter.setModel(model);

        System.out.println("Ingrese el color del vehículo: ");
        String color = sc.nextLine();
        scooter.setColor(color);

        System.out.println("Ingrese la capacidad del vehículo: ");
        int capacity = sc.nextInt();
        scooter.setPaxCapacity(capacity);
        sc.nextLine();

        System.out.println("Ingrese la referencia del vehículo: ");
        String reference = sc.nextLine();
        scooter.setReference(reference);

        System.out.println("Ingrese la placa del vehículo: ");
        String plate = sc.nextLine();
        scooter.setPlate(plate);

        System.out.println("Ingrese si el vehiculo está disponible para la renta (Ingrese true o false): ");
        boolean availableForRenting = sc.nextBoolean();
        scooter.setAvailableForRent(availableForRenting);
        sc.nextLine();

        System.out.println("Ingrese la capacidad del motor del vehículo: ");
        float engineCapacity = sc.nextFloat();
        scooter.setEngineCapacity(engineCapacity);
        sc.nextLine();

        System.out.println("Ingrese el precio por hora del alquiler del vehiculo: ");
        double priceHour = sc.nextDouble();
        scooter.setPricePerHour(priceHour);
        sc.nextLine();

        System.out.println("Ingrese la última fecha de mantenimiento del vehículo (DD,MM,YYYY): ");
        String lastMainteinanceDate = sc.nextLine();
        scooter.setLastMaintenanceDate(DateUtil.convertStringToDate(lastMainteinanceDate));

        scooter.setPickUpPoint(pickUpPoint);


        System.out.println("Ingrese el punto de recogida del scooter");




        scooterService.createScooter(scooter);

    }


}
