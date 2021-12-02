package homework3;

public class Frog {
    public interface FrogSpeak {
        default String speak(){
            return"БУБУБУБУ";
        };
    }

    public interface FrogSleep {
        default String sleep(){
            return "СПАТИ";

        };
    }

    public interface FrogSwim {
        default String swim(){
            return"ПЛАВАТИ";
        };
    }

    public interface FrogWalk {
        default String walk(){
            return"ГУЛЯТИ";
        };
    }
}
