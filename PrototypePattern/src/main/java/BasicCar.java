import java.util.Random;

public abstract class BasicCar implements Cloneable {
    private String modelName;
    private int basePrice,onRoadPrice;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBaseAndOnRoadPrice(int basePrice, int onRoadPrice){
        this.basePrice=basePrice;
        this.onRoadPrice= onRoadPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getOnRoadPrice() {
        return onRoadPrice;
    }

    public static int setAdditionalPrice(){
        int price = 0;
        Random random = new Random();
        int p = random.nextInt(1000);
        price=p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar) super.clone();
    }
}
