package homework1;

public class Cow extends Pet{

    @Override
    void voice() {

    }

    public Cow(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }


    interface Cowvoice{
        default void voice(){
            System.out.println("Я корова- Мууу-Мууу");
        }
    }



}
