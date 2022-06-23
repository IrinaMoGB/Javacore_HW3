package Part2;

public class Box <T extends Fruit> {
    T[] fruitArray;

    public Box(T[]fruitArray){
        this.fruitArray = fruitArray;
    }
     public Integer getWeightArray(){
        Integer result = 0;
        for(T t: getFruitArray()){
            if(t!=null){
                Integer value = t.getStoreBoxes();
                result = result + value;
            }
        }
        return result;
     }

    public Boolean compare(Box<? extends Fruit> box){
        if(this.getWeightArray().intValue() == box.getWeightArray().intValue()) return true;
        return false;
     }

     public void toEmptyBoxArray(Box<Apple> box){
        System.out.println("Было в коробке до: " + this.getWeightArray());
        System.out.println("Стало в коробке после: " + box.getWeightArray());
        for(int i = 0; i< box.getFruitArray().length;i++){
            if (box.getFruitArray()[i]!=null){
        this.getFruitArray()[getSize()] = (T) box.getFruitArray()[i];
        box.getFruitArray()[i] = null;
            }
        }
        System.out.println("Было в коробке до: "  + this.getWeightArray());
        System.out.println("Стало в коробке после: " + box.getWeightArray());
     }
     private int getSize(){
        int result = 0;
        for (T t: getFruitArray()){
            if(t!=null)result++;
        }
        return result;
     }
     public T[] getFruitArray(){
        return fruitArray;
     }

}
