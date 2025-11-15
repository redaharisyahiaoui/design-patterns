package behavioral.strategy.concrete;

import behavioral.strategy.TravelStrategy;

public class BoatTravelStrategy implements TravelStrategy {

    @Override
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " by boat.");
    }
    
}
