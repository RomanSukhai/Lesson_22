package homework3;

import homework3.Amphibia.AmphibiaSleep;

public class Main {
    public static void main(String[] args) {

        AmphibiaSleep amphibiaSleep = new AmphibiaSleep() {
            @Override
            public String sleep() {
                return AmphibiaSleep.super.sleep();
            }
        };

        Frog.FrogSleep frogSleep = new Frog.FrogSleep() {
            @Override
            public String sleep() {
                return Frog.FrogSleep.super.sleep();
            }
        };

        System.out.println(amphibiaSleep.sleep());
        System.out.println(frogSleep.sleep());
    }

}
