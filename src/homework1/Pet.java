package homework1;

public abstract class  Pet<NameAnimal> {

    private String NameAnimal;
    private int age;
    private double weight;
    private double height;

    abstract void voice();

    public Pet(String nameAnimal, int age, double weight, double height) {
        NameAnimal = nameAnimal;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setNameAnimal(String nameAnimal) {
        NameAnimal = nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String toString() {
        return "NameAnimal='" + NameAnimal + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height ;
    }
}
