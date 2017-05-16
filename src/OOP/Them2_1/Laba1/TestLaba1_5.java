package OOP.Them2_1.Laba1;

/**
 * Created by Yuriy on 02.02.2017.
 */
public class TestLaba1_5 {
    public static void main(String[] args) {
        Computer laptop1 = new Computer("IBM", 25667, 1000, 2, 2);
        Computer laptop2 = new Computer("HP", 299766, 2000, 4, 3);
        Computer laptop3 = new Computer("ACER", 30489, 1500, 2, 2);
        Computer laptop4 = new Computer("VAIO", 100034, 1700, 4, 5);
        Computer laptop5 = new Computer("MAC", 10988, 3000, 4, 4);

        Computer[] array = new Computer[5];

        array[0] = laptop1;
        array[1] = laptop2;
        array[2] = laptop3;
        array[3] = laptop4;
        array[4] = laptop5;

        for ( int i = 0; i < 5; i++){
            array[i].view();
        }

    }
}

