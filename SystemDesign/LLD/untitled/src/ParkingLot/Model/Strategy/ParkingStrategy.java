package ParkingLot.Model.Strategy;

public interface ParkingStrategy {
    void addSlot(Integer slotNumber);
    void removeSlot(Integer slotNumber);
    public Integer getNextSlot();
}
