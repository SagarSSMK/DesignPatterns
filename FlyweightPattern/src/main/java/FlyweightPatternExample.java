import java.util.Random;

public class FlyweightPatternExample {
    public static void main(String[] args) throws Exception {

        RobotFactory robotFactory = new RobotFactory();

        System.out.println("\n***Flyweight Pattern Example ***\n");
        Robot myRobot;
        for(int i=0;i<3;i++){
            myRobot=RobotFactory.getRobotFromFactory("small");
            // Not required to add sleep().But it is included to increase the probability of getting a new random number to see the variations in the output .
            Thread.sleep(1000);
            //The extrinsic property color is supplied by the client code.
            myRobot.showMe(getRandomColor());
        }
        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
        //Here we are trying to get 5 Large type robots
        for (int i = 0; i < 5; i++){
            myRobot = RobotFactory.getRobotFromFactory("large");
            Thread.sleep(1000);
            myRobot.showMe(getRandomColor());
        }
        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
        //Here we are trying to get 4 fixed sizerobots
        for (int i = 0; i < 4; i++){
            myRobot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(1000);
            //The extrinsic property color is supplied by the client code.
            myRobot.showMe(getRandomColor());
        }
        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);

    }
    static String getRandomColor(){
        Random random= new Random();
        int r = random.nextInt();
        if(r%2==0)
            return "red";
        else
            return "green";
    }
}
