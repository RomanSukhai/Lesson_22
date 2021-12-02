package homework1;

public class Cat extends Pet{

    @Override
    void voice() {

    }

    public Cat(String nameAnimal, int age, double weight, double height) {
        super(nameAnimal, age, weight, height);
    }
    interface CatVoice {
        default void voice(){
            System.out.println("Я кіт- Мяууу-Мяууу");
        }
    }

}
