package ParkingLot.Commands;

import ParkingLot.Model.Command;
import ParkingLot.OutPutPrinter;
import ParkingLot.Service.ParkingLotService;
import ParkingLot.Model.ParkingLot;
import java.util.List;
import ParkingLot.Model.Strategy.NaturalOrderParkingStrategy;

public class CreateParkingLotCommandExecutor extends CommandExecutor{
    public static String COMMAND_NAME = "create_parking_lot";

    public CreateParkingLotCommandExecutor(final ParkingLotService parkingLotService, final OutPutPrinter outPutPrinter){
        super(parkingLotService,outPutPrinter);
    }
    @Override
    public boolean validate(Command command) {
        final List<String> params = command.getParams();
        if (params.size() != 1) {
            return false;
        }
    }

    @Override
    public void execute(Command command) {
        final int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
        final ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
        parkingLotService.createParkingLot(parkingLot, new NaturalOrderParkingStrategy());
        outPutPrinter.printWithNewLine(
                "Created a parking lot with " + parkingLot.getCapacity() + " slots");
    }
}
