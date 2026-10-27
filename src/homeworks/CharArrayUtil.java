package homeworks;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

//      Խնդիր 1
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
        System.out.println();

//      Խնդիր 2
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum++;
        }
        System.out.println("Characters count: " + sum);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

        System.out.println();

//      Խնդիր 3
        char c = 'a';
        int countSymbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countSymbol++;
            }
        }
        System.out.println("Character " + "'" + c + "'" + " count: " + countSymbol);

        System.out.println();

//      Խնդիր 4
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelsCount++;
                }
            }
        }
        System.out.println("Vowels count: " + vowelsCount);

        System.out.println();

//      Խնդիր 5
        char[] consonants = {
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
        };
        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (chars[i] == consonants[j]) {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consonantsCount);

        System.out.println();

//      Խնդիր 6
        int spaceCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Spaces count: " + spaceCount);

        System.out.println();

//      Խնդիր 7
        char[] reverseChar = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < reverseChar.length; i++) {
            System.out.print(reverseChar[i]);
        }
        for (int i = 0; i < reverseChar.length / 2; i++) {
            char temp = reverseChar[i];
            reverseChar[i] = reverseChar[chars.length - 1 - i];
            reverseChar[reverseChar.length - 1 - i] = temp;
        }
        System.out.println();
        for (int i = 0; i < reverseChar.length; i++) {
            System.out.print(reverseChar[i]);
        }

        System.out.println();

//      Խնդիր 8
        char[] upperChars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < upperChars.length; i++) {
            if (upperChars[i] >= 'a' && upperChars[i] <= 'z') {
                upperChars[i] = (char) (upperChars[i] - 32);
            }
        }
        char[] lowerChars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < lowerChars.length; i++) {
            if (lowerChars[i] >= 'A' && lowerChars[i] <= 'Z') {
                lowerChars[i] = (char) (lowerChars[i] + 32);
            }
        }
        System.out.println("Uppercase: ");
        for (int i = 0; i < upperChars.length; i++) {
            System.out.print(upperChars[i]);
        }
        System.out.println();
        System.out.println("Lowercase: ");
        for (int i = 0; i < lowerChars.length; i++) {
            System.out.print(lowerChars[i]);
        }

        System.out.println();

//      Խնդիր 9
        char[] swappingChars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < swappingChars.length; i++) {
            System.out.print(swappingChars[i]);
        }
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < swappingChars.length; i++) {
            if (swappingChars[i] == oldChar) {
                swappingChars[i] = newChar;
            }
        }
        System.out.println();
        for (int i = 0; i < swappingChars.length; i++) {
            System.out.print(swappingChars[i]);
        }

        System.out.println();
        System.out.println();

//      Խնդիր 10
        boolean palindrome = true;
        char[] palindromeChars = {'l', 'e', 'v', 'e', 'l'};
        for (int i = 0; i < palindromeChars.length / 2; i++) {
            if (palindromeChars[i] != palindromeChars[palindromeChars.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + palindrome);
    }
}
