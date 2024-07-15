public abstract class Human {
    // If a class is having abstract method then we need to declare that class as abstract class
    // Creation of object for abstract class is not possible
    // If a class will extend abstract class then that class need to implement all the abstract method
    // present in that class or that class can decare itself also abstract
    String name;
    int hands = 2;
    int legs = 2;
    String skinColor;

    // abstract methods are those method which are defined but not implemented or
    // implementation is not done

    public abstract void doOfficeWork();

    public void moveHand(){
        System.out.println();
    }

    public void walk(){
        System.out.println();
    }

    public void eat(){
        System.out.println();
    }

    public void sleep(){
        System.out.println();
    }
}
