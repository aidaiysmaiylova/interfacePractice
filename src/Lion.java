public class Lion extends PredatorAbstract{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting");

    }
}
