public class Exercise5 {
    //Write a Java program to find the duplicate values of an array of integer values.
    int array[] = {5,6,7,12,-5,32,43,6,12};

    public void duplicateElements() {
        System.out.println("Exercise5: Duplicate values of an array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println(array[j]);
                }
            }
        }

    }
}
