package ParkingLot.Commands;

import ParkingLot.Exceptions.InvalidCommandException;
import ParkingLot.Model.Command;
import ParkingLot.OutPutPrinter;
import ParkingLot.Service.ParkingLotService;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory{
    private Map<String, CommandExecutor> commands = new HashMap<>();

    public CommandExecutorFactory(final ParkingLotService parkingLotService){
        final OutPutPrinter outPutPrinter = new OutPutPrinter();
        commands.put(
                CreateParkingLotCommandExecutor.COMMAND_NAME,
                new CreateParkingLotCommandExecutor(parkingLotService, outPutPrinter));

        commands.put(
                ColorToRegNumberCommandExecutor.COMMAND_NAME,
                new ColorToRegNumberCommandExecutor(parkingLotService, outPutPrinter));
    }

    public CommandExecutor getCommandExecutor(final Command command){
        final CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if(commandExecutor == null){
            throw new InvalidCommandException();
        }
        return commandExecutor;
    }
}
