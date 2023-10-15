package com.assignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
	
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        
        // Shuffle the list
        Collections.shuffle(list);
        
        // Convert the shuffled list back to an array
        array = list.toArray(new Integer[0]);
        
        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}

