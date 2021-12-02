package homework1;

public class Main {
    public static void main(String[] args) {
        Cow co  = new Cow("Stella",14,200,333);
        Dog dog = new Dog("John",21,50,30);
        Cat ca  = new Cat("Vasul",10,20,10);

        System.out.println(co);
        System.out.println(dog);
        System.out.println(ca);
        System.out.println(" ");
        Cow.Cowvoice cowvoice = new Cow.Cowvoice() {
            @Override
            public void voice() {
                Cow.Cowvoice.super.voice();
            }
        };
        Dog.DogVoice dogVoice = new Dog.DogVoice() {
            @Override
            public void voice() {
                Dog.DogVoice.super.voice();
            }
        };
        Cat.CatVoice catVoice = new Cat.CatVoice() {
            @Override
            public void voice() {
                Cat.CatVoice.super.voice();
            }
        };

        catVoice.voice();
        cowvoice.voice();
        dogVoice.voice();
    }
}
