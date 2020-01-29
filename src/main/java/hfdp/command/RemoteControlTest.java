package hfdp.command;

import hfdp.command.commands.LightCommand;
import hfdp.command.invokers.RemoteControl;
import hfdp.command.invokers.SimpleRemoteControl;


public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(new LightCommand(new Light()));
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();
        Light garageLight = new Light();
        Light kitchenLight = new Light();

        LightCommand garageLightCommand = new LightCommand(garageLight);
        LightCommand kitchenLightCommand = new LightCommand(kitchenLight);

        remoteControl.setCommand(0, garageLightCommand, garageLightCommand);
        remoteControl.setCommand(1, kitchenLightCommand, kitchenLightCommand);
        System.out.println(remoteControl.toString());
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.undoCommandWasPushed();
    }
}
