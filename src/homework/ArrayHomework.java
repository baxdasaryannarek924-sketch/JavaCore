package homework;

public class ArrayHomework {
    static void main() {
//      Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of " + n + ": "  + count);

        System.out.println();
//      Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] nums = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        int temp;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println();

//      Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] numbers2 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int totalRepeated = 0;
        for (int i = 0; i < numbers2.length; i++) {
            boolean before = false;
            for (int j = 0; j < i; j++) {
                if (numbers2[j] == numbers2[i]) {
                    before = true;
                }
            }
            if (before) {
                continue;
            }
            int countNumbers2 = 0;
            for (int k = 0; k < numbers2.length; k++) {
                if (numbers2[k] == numbers2[i]) {
                    countNumbers2++;
                }
            }
            if (countNumbers2 > 1) {
                totalRepeated++;
            }
        }
        System.out.println("Repeated numbers count: " + totalRepeated);

        System.out.println();

//      Խնդիր 4 — Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelsCount++;
                }
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
    }
}