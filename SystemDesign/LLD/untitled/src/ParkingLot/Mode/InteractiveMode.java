package ParkingLot.Mode;

import ParkingLot.Commands.CommandExecutorFactory;
import ParkingLot.OutPutPrinter;

import java.io.IOException;

public class InteractiveMode extends Mode{
    public InteractiveMode(final CommandExecutorFactory commandExecutorFactory,
                    final OutPutPrinter outPutPrinter){
        super(commandExecutorFactory,outPutPrinter);
    }
    @Override
    protected void Process() throws IOException {

    }
}
