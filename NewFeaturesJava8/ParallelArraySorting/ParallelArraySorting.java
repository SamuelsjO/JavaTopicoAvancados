package NewFeaturesJava8.ParallelArraySorting;

import java.util.Arrays;

public class ParallelArraySorting {
  public static void main(String[] args) {

    System.out.println("Array original: ");
    int[] meu_array = {5, 8, 1, 0, 6, 9, 50, -3};
    for (int i : meu_array){
      System.out.println(i + " ");
    }

    System.out.println("Parallel sorting: ");

    Arrays.parallelSort(meu_array);
    for (int i : meu_array){
      System.out.println(i + " ");
    }

    System.out.println("Parallel sorting de index a index: ");

    Arrays.parallelSort(meu_array,0, 5);
    for (int i : meu_array){
      System.out.println(i + " ");
    }
  }
}
