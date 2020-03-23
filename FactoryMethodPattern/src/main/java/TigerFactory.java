public class TigerFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
