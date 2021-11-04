package P312;


import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<>();





    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        List<Event> copy_eventList = new ArrayList<>(eventList);

        while (eventList.size() > 0)
            for (Event e : copy_eventList)
                if (e.ready()) {
                    System.out.println(e.ready());
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}
