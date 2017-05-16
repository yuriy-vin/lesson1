package OOP.Them2_1.Laba1;

public class TestLabasLesson1 {
    public static void main(String[] args) {
        float increasingPrice = 1.1f;
// creating data arrays>>
        int[] serialsArr = {123456, 67891, 23456, 789456, 987654};
        String[] namesArr = {"Moms PC", "Fathers laptop", "Sisters PC", "My laptop", "Brothers PC"};
        float[] pricesArr = {950.75f, 1913.31f, 678.83f, 1135.91f, 478.99f};
        int[] cuantityArr = {4, 8, 2, 4, 2};
        int[] frequencyArr = {2500, 4200, 2800, 3200, 2100};

// creating Array of Computers:
        Comp[] computers = new Comp[5];

// set new computers to array and add fields i it:

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Comp(serialsArr[i]);
            computers[i].setName(namesArr[0]+ " "+i);
            computers[i].setPrice(pricesArr[i] * increasingPrice); // increasing price by 10%
            computers[i].setCuantityCPU(cuantityArr[i]);
            computers[i].setFrequency(frequencyArr[i]);

// lets see what wee done:
            computers[i].view();
        }
    }
}
