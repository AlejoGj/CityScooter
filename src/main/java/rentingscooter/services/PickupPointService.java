package rentingscooter.services;

import rentingscooter.domain.PickUpPoint;

public interface PickupPointService {

    public PickUpPoint createPickupPoint (PickUpPoint pickUpPoint);
    public PickUpPoint getPickupPointById (int id);
    public PickUpPoint getAllPickupPoints ();
    public PickUpPoint updatePickupPoint(PickUpPoint pickUpPoint);
    public void deletePickupPoint (int id);

}
