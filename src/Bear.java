public class Bear extends PredatorAbstract{
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Bear is hunting");

    }
}
