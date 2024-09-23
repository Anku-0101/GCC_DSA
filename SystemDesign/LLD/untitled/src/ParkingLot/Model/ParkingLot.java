package ParkingLot.Model;

import ParkingLot.Exceptions.*;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int capacity;
    private Map<Integer, Slot> slots;

    public int getCapacity(){
        return capacity;
    }

    public Map<Integer, Slot> getSlots(){
        return slots;
    }
    public ParkingLot(int capacity){
        if(capacity<=0){
            throw new ParkingLotExceptions("Invalid Capacity given for parking lot");
        }
        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

    private Slot getSlot(Integer slotNumber){
        if(slotNumber > getCapacity() || slotNumber < 0){
            throw new InvalidSlotException();
        }
        final Map<Integer, Slot> allSlots = getSlots();
        if(!allSlots.containsKey(slotNumber)){
            allSlots.put(slotNumber, new Slot(slotNumber));
        }
        return allSlots.get(slotNumber);
    }
    
    public Slot Park(final Car car, final Integer slotNumber){
        final Slot slot = getSlot(slotNumber);
        if(!slot.isSlotFree()){
            throw new SlotAlreadyOccupiedException();
        }
        slot.assignCar(car);
        return slot;
    }

    public Slot makeSlotFree(Integer slotNumber){
        final Slot slot = getSlot(slotNumber);
        slot.unassignCar();
        return slot;
    }
}
