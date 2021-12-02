package homework3;

public class Amphibia {
    public interface AmphibiaSpeak {
        default String speak(){
            return"БУБУБУБУ";
        };
    }

    public interface AmphibiaSleep {
        default String sleep(){
            return "СПАТИ";

        };
    }

    public interface AmphibiaSwim {
        default String swim(){
            return"ПЛАВАТИ";
        };
    }

    public interface AmphibiaWalk {
        default String walk(){
            return"ГУЛЯТИ";
        };
    }
}