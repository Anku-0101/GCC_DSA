package ParkingLot.Mode;

import ParkingLot.Commands.CommandExecutor;
import ParkingLot.Commands.CommandExecutorFactory;
import ParkingLot.Exceptions.InvalidCommandException;
import ParkingLot.Model.Command;
import ParkingLot.OutPutPrinter;

import java.io.IOException;

public abstract class Mode {
    private CommandExecutorFactory commandExecutorFactory;
    protected OutPutPrinter outPutPrinter;

    public Mode(final CommandExecutorFactory commandExecutorFactory,
                final OutPutPrinter outPutPrinter){
        this.commandExecutorFactory = commandExecutorFactory;
        this.outPutPrinter = outPutPrinter;
    }

    protected void processCommand(final Command command){
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);
        if(commandExecutor.validate(command)) {
            commandExecutor.execute(command);
        }else {
            throw new InvalidCommandException();
        }
    }

    protected abstract void Process()throws IOException;
}
