package P312;

public class GreenHouseControls extends Controller {
    private boolean windowOpen  = false;
    class AerationOn extends Event{
        public AerationOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            windowOpen = true;
        }

        @Override
        public String toString() {
            return "Проветривание запущено " + delayTime+windowOpen;
        }
    }
    class AerationOff extends Event{
        public AerationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            windowOpen = false;
        }
        @Override
        public String toString() {
            return "Проветривание окончено " + delayTime + windowOpen;
        }
    }
    private boolean lights = false;
    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // here is the equipment control code
            lights = true;

        }

        @Override
        public String toString() {
            return "Ligts is on " + delayTime+lights;
        }
    }
    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            lights = false;
        }

        @Override
        public String toString() {
            return "lights Of " + delayTime+lights;
        }
    }
    private boolean water = false;
    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "poliv ON " + delayTime;
        }
    }
    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }


        @Override
        public String toString() {
            return "Poliv is OFF "  + delayTime;
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "night functions " + delayTime;
        }
    }
    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Day function " + delayTime;
        }
    }
    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "BAMMM! " + delayTime;
        }
    }
    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restart system---Restart system---" + delayTime;
        }
    }
    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение " + delayTime;
        }
    }
    public  class Terminate2 extends Event {

        public Terminate2(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение " + delayTime;
        }
    }
}
