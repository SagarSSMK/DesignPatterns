public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger=tigerFactory.createAnimal();
        aTiger.preferredAction();
        aTiger.speak();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.preferredAction();
        aDog.speak();
    }
}
