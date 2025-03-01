package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Timer timer;

    @Autowired
    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(timer);
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
