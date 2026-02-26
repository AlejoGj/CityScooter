package rentingscooter.services;

import rentingscooter.domain.Scooter;

import java.util.ArrayList;

public interface ScooterService {

    public Scooter createScooter(Scooter scooter);
    public ArrayList<Scooter> getAllScooters();
    public Scooter getScooterById(int id);
    public Scooter updateScooter(Scooter scooter);
    public void deleteScooter(int id);
}
