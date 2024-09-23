package ParkingLot.Commands;

import ParkingLot.Model.Command;
import ParkingLot.Model.Slot;
import ParkingLot.Service.ParkingLotService;
import ParkingLot.*;

import java.util.List;
import java.util.stream.Collectors;

public class ColorToRegNumberCommandExecutor extends CommandExecutor{
    public static String COMMAND_NAME = "registration_numbers_for_cars_with_colour";

    public ColorToRegNumberCommandExecutor(
            final ParkingLotService parkingLotService, final OutPutPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }
    @Override
    public boolean validate(Command command) {
        return command.getParams().size()==1;
    }

    @Override
    public void execute(Command command) {
        final List<Slot> slotsForColor = parkingLotService.getSlotForColor(command.getParams().get(0));
        if(slotsForColor.isEmpty()){
            outPutPrinter.notFound();
        }else{
            final String result = slotsForColor.stream()
                    .map(slot -> slot.getParkedCar().getRegistrationNumber())
                    .collect(Collectors.joining(", "));
            outPutPrinter.printWithNewLine(result);
        }
    }
}
