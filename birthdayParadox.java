package Junior;

import java.util.Arrays;
import java.util.Random;

public class birthdayParadox {
    public static void main(String[] args) {
        int[] groupSizes = {5, 10, 15, 20, 100};
        int trials = 1000;

        for (int groupSize : groupSizes) {
            int duplicateCount = 0;

            for (int i = 0; i < trials; i++) {
                if (hasDuplicates(genBirthdays(groupSize)))
                    duplicateCount++;
            }

            boolean hasDuplicate = duplicateCount > 0;
            System.out.println("Group size: " + groupSize);
            System.out.println("Has duplicate: " + hasDuplicate + "\n");
        }
    }

    public static int[] genBirthdays(int groupSize) {
        int[] birthdays = new int[groupSize];
        Random random = new Random();

        for (int i = 0; i < groupSize; i++) {
            birthdays[i] = random.nextInt(365) + 1; // Random birthday between 1 and 365
        }

        return birthdays;
    }

    public static boolean hasDuplicates(int[] birthdays) {
        Arrays.sort(birthdays);

        for (int i = 1; i < birthdays.length; i++) {
            if (birthdays[i] == birthdays[i - 1]) {
                return true; // Found a duplicate
            }
        }

        return false; // No duplicates found
    }
}
