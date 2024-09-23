import DecoratorPattern.BasePizza;
import DecoratorPattern.Margerita;
import DecoratorPattern.MushroomDecorator;
import DecoratorPattern.Paneer;
import LSP.Bicycle;
import LSP.Car;
import LSP.Vehicle;
import ObserverPattern.Mobile;
import ObserverPattern.Observer;
import ObserverPattern.Television;
import ObserverPattern.WeatherStation;
import ParkingLot.*;
import ParkingLot.Commands.CommandExecutorFactory;
import ParkingLot.Service.ParkingLotService;
import StrategyPattern.BubbleSort;
import StrategyPattern.SelectionSort;
import StrategyPattern.SortingContext;
import StrategyPattern.SortingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        for(String arg : args){
            System.out.println(arg);
        }
    }

    private static void testParkingStrategy(){
        final OutPutPrinter outputPrinter = new OutPutPrinter();
        final ParkingLotService parkingLotService = new ParkingLotService();
        final CommandExecutorFactory commandExecutorFactory =
                new CommandExecutorFactory(parkingLotService);
        /*
        if (isInteractiveMode(args)) {
            new InteractiveMode(commandExecutorFactory, outputPrinter).process();
        } else if (isFileInputMode(args)) {
            new FileMode(commandExecutorFactory, outputPrinter, args[0]).process();
        } else {
            throw new InvalidModeException();
        }*/
    }


    private static void testDecoraterPattern(){
        BasePizza pizza = new Margerita();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new Paneer(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());



    }

    private static void testObserverPattern(){
        WeatherStation station = new WeatherStation();
        Observer tv = new Television();
        Observer mobile = new Mobile();
        station.addObserver(tv);
        station.addObserver(mobile);
        station.setWeather("23C");
        station.removeObserver(tv);
        station.setWeather("98");

    }

    private void testStrategyPattern(){
        SortingContext sortingContext = new SortingContext(new BubbleSort());
        sortingContext.PerformSorting(new int[]{1,3,4});
    }
    private void testLSP() throws IllegalAccessException {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        for(var vehicle : vehicles) {
            System.out.println(vehicle.getNumberOfWheel());
            vehicle.StartEngine();
        }
    }


}