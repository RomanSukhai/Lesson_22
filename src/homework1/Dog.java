package homework1;

public class Dog extends Pet{

    @Override
    void voice() {

    }

    public Dog(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }

    interface DogVoice{
        default void voice(){
            System.out.println("Я пес - Гаууу-Гаууу");
        }
    }

}
