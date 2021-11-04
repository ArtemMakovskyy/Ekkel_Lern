package P312;

public class GrenhouseController {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[]events = {
                gc.new ThermostatNight(2),
                gc.new LightOn(950),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new AerationOn(1000),
                gc.new AerationOff(1100),
                gc.new ThermostatDay(1400),
                gc.new Terminate2(1500),


        };
        gc.addEvent(gc.new Restart(2000,events));
        if (args.length == 1)
        gc.addEvent(
                new GreenHouseControls.Terminate(
                        new Integer(args[0])));
        gc.run();
    }
}
