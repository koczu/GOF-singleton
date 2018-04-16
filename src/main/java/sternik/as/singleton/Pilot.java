package sternik.as.singleton;

import sternik.as.singleton.commands.*;
import sternik.as.singleton.commands.fan.*;
import sternik.as.singleton.commands.garagegate.CommandGarageGateClose;
import sternik.as.singleton.commands.garagegate.CommandGarageGateOpen;
import sternik.as.singleton.commands.light.CommandsLightOff;
import sternik.as.singleton.commands.light.CommandsLightOn;
import sternik.as.singleton.commands.televisor.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Pilot {
    private Map<String, Command> buttons = new HashMap<>();
    private int menu = 1;

    private Pilot() {
        switchMenu();
}
    public static void main(String[] args) {

        Pilot pilot = new Pilot();
        boolean doContinue = true;
        String chosenNumber = null;

        do {
            System.out.println("");

            pilot.showMenu();
            System.out.print("Choose option: ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                chosenNumber = br.readLine();
                System.out.println("");
                pilot.pushButtonNumber(chosenNumber);
                doContinue = wasExitButtonPressed(chosenNumber);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Wrong choice try again");
            }

        } while (doContinue);
    }

    private void pushButtonNumber(String number) {
        Command command = getCommandForKey(number.toUpperCase());
        System.out.println("Pressed: " + number);
        command.execute();
    }

    private static boolean wasExitButtonPressed(String charButton) {
        return !(charButton.toUpperCase().equals("Z"));
    }

    private Command getCommandForKey(String upperCase) {
        return buttons.get(upperCase);
    }

    private void showMenu() {
        System.out.println("------>Pilot Menu<------");
        for (Map.Entry<String, Command> entry : buttons.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getDescription());
        }
    }

    public void switchMenu() {

        if (menu == 1) {
            menu = 0;
            buttons.put("1", new CommandsLightOn());
            buttons.put("2", new CommandsLightOff());
            buttons.put("3", new CommandGarageGateOpen());
            buttons.put("4", new CommandGarageGateClose());
            buttons.put("5", new CommandsFanOn());
            buttons.put("6", new CommandsFanRotation1());
            buttons.put("7", new CommandsFanRotation2());
            buttons.put("8", new CommandsFanRotation3());
            buttons.put("9", new CommandsFanOff());
            buttons.put("0", new CommandSwitchMenu(this));
            buttons.put("Z", new CommandClose());
        } else {
            menu = 1;
            buttons.put("1", new CommandsTelevisorOn());
            buttons.put("2", new CommandsTelevisorOff());
            buttons.put("3", new CommandsTelevisorVolumeUp());
            buttons.put("4", new CommandsTelevisorChannelDown());
            buttons.put("5", new CommandsTelevisorChannelUp());
            buttons.put("6", new CommandsTelevisorChannelDown());
            buttons.put("7", new CommandEmpty());
            Command[] commands = { new CommandsTelevisorOn(), new CommandsTelevisorOff() };
            buttons.put("8", new CommandMacro(commands));
            buttons.put("9", new CommandEmpty());
            buttons.put("0", new CommandSwitchMenu(this));
            buttons.put("Z", new CommandClose());
            buttons.put("B", new CommandLazyPersonMode());
            buttons.put("A", new CommandTurnOffAll());
        }

    }
}
