package source.animals;

public class Girafa extends Animal{



    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("girafa " + this.getNume() + " mananca " + mancare);
    }



}
