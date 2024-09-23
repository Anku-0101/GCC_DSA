package ParkingLot.Commands;
import ParkingLot.*;

import ParkingLot.Model.Command;
import ParkingLot.Service.ParkingLotService;

public abstract class CommandExecutor {
    protected ParkingLotService parkingLotService;
    protected OutPutPrinter outPutPrinter;

    CommandExecutor(final ParkingLotService parkingLotService, final OutPutPrinter outPutPrinter){
        this.parkingLotService = parkingLotService;
        this.outPutPrinter = outPutPrinter;
    }

    public abstract boolean validate(final Command command);
    public abstract void execute(final Command command);

}
