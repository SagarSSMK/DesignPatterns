public class DecoratorPatternExample {

    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***\n");
        ConcreteComponent concreteComponentWithoutDecorator= new ConcreteComponent();
        concreteComponentWithoutDecorator.makeHouse();

        //Using a decorator to add floor
        System.out.println("Using a Floor decorator now.");
        FloorDecorator floorDecorator= new FloorDecorator();
        floorDecorator.makeHouse();
        System.out.println("_________________");

        //Using a decorator to add floor to original house and then
        //paint it.
        System.out.println("Using a Paint decorator now.");
        PaintDecorator paintDecorator= new PaintDecorator();
        paintDecorator.makeHouse();
        System.out.println("_________________");

    }
}
