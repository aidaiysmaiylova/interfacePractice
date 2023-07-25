public class Volf extends PredatorAbstract{


    public Volf(String name, int age) {
        super(name, age);
    }


    @Override
    public void hunt() {
        System.out.println("Volf is hunting");
    }
}
