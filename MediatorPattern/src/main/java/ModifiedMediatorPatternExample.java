public class ModifiedMediatorPatternExample {

    public static void main(String[] args) throws InterruptedException {

        ConcreteMediator mediator=new  ConcreteMediator();

        Employee sagar= new ConcreteEmployee(mediator,"Sagar",true);
        Employee amith= new ConcreteEmployee(mediator,"Amith",false);
        Employee ravi=new ConcreteEmployee(mediator,"Amith",true);

        Employee manju= new ConcreteEmployee(mediator,"Manju",false);
        mediator.register(sagar);
        mediator.register(ravi);
        mediator.register(manju);

        mediator.displayEmployees();

        sagar.send(amith,"Hey Amit");
        amith.send(manju,"Hey Manju");

        sagar.receive(ravi,"Hey Ravi");


    }
}
