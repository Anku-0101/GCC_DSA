package ParkingLot;

public class OutPutPrinter {
    public void Welcome(){
        printWithNewLine("Welcome to xyz parking lot");
    }
    public void end(){
        printWithNewLine("Thanks for using service");
    }
    public void notFound(){
        printWithNewLine("Sorry, parking lot is full");
    }
    public void statusHeader(){
        printWithNewLine("SlotNumber  RegistrationNumber Color");
    }
    public void parkingLotFull(){
        printWithNewLine("Sorry, Parking lot is full");
    }
    public void parkingLotEmpty(){
        printWithNewLine("Parking Lot is empty");
    }
    public void invalidFile(){
        printWithNewLine("Invalid file given");
    }
    public void printWithNewLine(String message){
        System.out.println(message);
    }


}
