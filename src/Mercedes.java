import javax.sound.midi.Soundbank;

public class Mercedes extends Car implements CarRegulations{


    public void runEngine() {
        System.out.println("Strating mercedes engine");
    }


    public void accelerate() {
        System.out.println("Accelerating mercedes");
    }


    public void applyBreaks() {
        System.out.println("Applying breakes mercedes");
    }

    @Override
    public void pollutionCertificate() {

    }

    @Override
    public void numberPlate() {

    }
}
