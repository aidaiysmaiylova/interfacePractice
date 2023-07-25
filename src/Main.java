public class Main {
    public static void main(String[] args) {
PredatorAbstract[] huntable={
        new Lion("Lion",6),
        new Bear("Bear",5),
        new Volf("Volf",5)
};
        for(PredatorAbstract huntables:huntable){
            huntables.hunt();
            System.out.println(huntables.age);
            System.out.println(huntables.name);
        }

    }
}