package nl.novi.javaprogrammeren.overerving;

public class SpaceXRocket extends Rocket {

    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public int calculateMetersFlown(int fuel) {
        int meters = super.calculateMetersFlown(fuel);
        return meters + (50 * fuel);
    }
}
