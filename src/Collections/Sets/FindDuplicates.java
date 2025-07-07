package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 5, 4, 2};

        Set<Integer> temp = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i : arr)
        {
            if(!temp.add(i))
            {
                duplicates.add(i);

            }
        }
        System.out.println("Duplicate are " + duplicates);

        System.out.println("Remove Duplicates and print " + temp);

    }

    /*

    temp is a HashSet<Integer> — it stores only unique elements.

    temp.add(num) tries to add the current number to the temp set.

    If the number was already in the set, add(num) will return false, because sets do not allow duplicates.

   So !temp.add(num) means: "If the number is already in the set, i.e., it's a duplicate."

   If the number is a duplicate (i.e., already seen before), we add it to another set called duplicates.

   Using a second set ensures that each duplicate is only stored once, even if it appears more than twice.

    */
}
