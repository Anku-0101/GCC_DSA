package ParkingLot.Service;

import ParkingLot.Exceptions.ParkingLotExceptions;
import ParkingLot.Model.Car;
import ParkingLot.Model.ParkingLot;
import ParkingLot.Model.Slot;
import ParkingLot.Model.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLotService {
    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

    public void createParkingLot(final ParkingLot parkingLot, final ParkingStrategy parkingStrategy){
        if(this.parkingLot != null){
            throw new ParkingLotExceptions("Parking Lot already exists");
        }
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;

        for(int i = 1; i<=parkingLot.getCapacity(); i++){
            parkingStrategy.addSlot(i);
        }
    }

    public Integer Park(final Car car){
        final Integer nextParkingSlot = parkingStrategy.getNextSlot();
        parkingLot.Park(car,nextParkingSlot);
        parkingStrategy.removeSlot(nextParkingSlot);
        return nextParkingSlot;
    }

    public void makeSlotFree(Integer slotNumber){
        parkingLot.makeSlotFree(slotNumber);
        parkingStrategy.addSlot(slotNumber);
    }

    public List<Slot> getOccupiedSlots(){
        final List<Slot> occupiedSlotList = new ArrayList<>();
        final Map<Integer, Slot> allSlots = parkingLot.getSlots();
        for(int i = 1; i<=parkingLot.getCapacity(); i++){
            if(allSlots.containsKey(i)){
                final Slot slot = allSlots.get(i);
                if(!slot.isSlotFree()){
                    occupiedSlotList.add(slot);
                }
            }
        }
        return occupiedSlotList;
    }
    public List<Slot> getSlotForColor(final String color){
        final List<Slot> occupiedSlots = getOccupiedSlots();
        return occupiedSlots.stream()
                .filter(slot -> slot.getParkedCar().getColor().equals(color))
                .collect(Collectors.toList());
    }

}
