package Part2;

public abstract class Fruit {
    private String name;
    private Integer storeBoxes;

    public Fruit(String name, Integer storeBoxes) {
        this.name = name;
        this.storeBoxes = storeBoxes;
    }
    public String getName() {
        return name;
    }

    public Integer getStoreBoxes() {
        return storeBoxes;
    }
}
