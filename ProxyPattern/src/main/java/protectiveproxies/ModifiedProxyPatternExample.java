package protectiveproxies;

public class ModifiedProxyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Modified Proxy Pattern Demo***\n");
        //Admin is an authorized user
        ModifiedProxy px1 = new ModifiedProxy("Admin");
        px1.doSomeWork();
        //Robin is an unauthorized user
        ModifiedProxy px2 = new ModifiedProxy("Robin");
        px2.doSomeWork();
    }
}
