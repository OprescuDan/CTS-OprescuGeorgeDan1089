package source.animals;

public class Zebra extends Animal {

    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("zebra " + this.getNume() + " mananca " + mancare);

    }


}
