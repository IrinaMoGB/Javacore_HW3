package Part2;

public class BoxClass {
    public static void main(String[] args) {
        Apple[] apples = new Apple[4];

        Apple apple0 = new Apple(1);
        Apple apple1 = new Apple(1);
        apples[0] = apple0;
        apples[1] = apple1;
        Box<Apple> box1= new Box<>(apples);

        Apple[] apples2 = new Apple[6];
        apples2[0] = apple0;
        apples2[1] = apple1;

        Box<Apple> box2 = new Box<>(apples2);


        System.out.println(box1.getFruitArray());
        System.out.println(box1.compare(box2));

        box1.toEmptyBoxArray(box2);
        System.out.println(box2);

    }
}
