public class RandomRunner {
    public static void main(String[] args) {

        // 1
        System.out.println("\nQuestion 1");
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }

        // 2
        System.out.println("\nQuestion 2");
        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = false;
        System.out.println(bools.length + "\n" + bools[0] + "\n" + bools[5]);

        // 3
        System.out.println("\nQuestion 3");
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp;
        temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        // 4
        System.out.println("\nQuestion 4");
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        // 5
        System.out.println("\nQuestion 5");
        String[] animals = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i]);
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";

        animals[2] += "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());

        // 6
        System.out.println("\nQuestion 6");
        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);

        Dog[] dogs = {dog1, dog2, dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());

    }
}
