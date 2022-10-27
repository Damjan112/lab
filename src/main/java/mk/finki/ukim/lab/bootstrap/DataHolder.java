package mk.finki.ukim.lab.bootstrap;

import mk.finki.ukim.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Balloon> balloons=new ArrayList<>();

    @PostConstruct
    public void init(){

        this.balloons.add(new Balloon("1", "1"));
        this.balloons.add(new Balloon("2", "2"));
        this.balloons.add(new Balloon("3", "3"));
        this.balloons.add(new Balloon("4", "4"));
        this.balloons.add(new Balloon("5", "5"));
        this.balloons.add(new Balloon("6", "6"));
        this.balloons.add(new Balloon("7", "7"));
        this.balloons.add(new Balloon("8", "8"));
        this.balloons.add(new Balloon("9", "9"));
        this.balloons.add(new Balloon("10", "10"));
    }
}
