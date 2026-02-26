package rentingscooter.services;

import rentingscooter.domain.Scooter;

import java.util.ArrayList;
import java.util.Date;

public class ScooterSeviceImpl implements ScooterService {

    @Override
    public Scooter createScooter(Scooter scooter) {
        return scooter;
    }

    public void printScooter(Scooter scooter){
        System.out.println("ID del scooter: "+scooter.getIdVehicle());
    }

    @Override
    public ArrayList<Scooter> getAllScooters() {
        return null;
    }

    @Override
    public Scooter getScooterById(int id) {
        return null;
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public void deleteScooter(int id) {

    }




}
