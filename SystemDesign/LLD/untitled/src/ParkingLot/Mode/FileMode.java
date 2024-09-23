package ParkingLot.Mode;

import ParkingLot.Commands.CommandExecutorFactory;
import ParkingLot.Model.Command;
import ParkingLot.OutPutPrinter;

import java.io.*;

public class FileMode extends Mode {
    private String fileName;

    public FileMode(final CommandExecutorFactory commandExecutorFactory,
                    final OutPutPrinter outPutPrinter,
                    final String fileName){
        super(commandExecutorFactory,outPutPrinter);
        this.fileName = fileName;
    }
    @Override
    protected void Process() throws IOException {
        final File file = new File(fileName);
        final BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            outPutPrinter.invalidFile();
            return;
        }

        String input = reader.readLine();
        while (input != null) {
            final Command command = new Command(input);
            processCommand(command);
            input = reader.readLine();
        }
    }
}
