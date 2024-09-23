package ParkingLot.Model;

import ParkingLot.Exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private static final String SPACE =" ";
    private String commandName;
    private List<String> params;

    public String getCommandName(){
        return commandName;
    }

    public List<String> getParams(){
        return params;
    }

    public Command(String inputLine){
        // Step 1: Trim the input line and split it into an array of tokens
        inputLine = inputLine.trim();
        String[] tokensArray = inputLine.split(SPACE);

        // Step 2: Create a List to store non-empty tokens
        List<String> tokensList = new ArrayList<>();

        // Step 3: Process each token
        for (String token : tokensArray) {
            // Trim each token
            token = token.trim();
            // Add non-empty tokens to the list
            if (token.length() > 0) {
                tokensList.add(token);
            }
        }

        // Step 4: Check if the list is empty and throw an exception if necessary
        if (tokensList.size() == 0) {
            throw new InvalidCommandException();
        }

        // Step 5: Extract commandName and params from the list
        commandName = tokensList.get(0).toLowerCase();
        tokensList.remove(0);
        params = tokensList;
    }
}
