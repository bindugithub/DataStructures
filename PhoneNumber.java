public class PhoneNumber {
    public static void main(String[] args) {
        int[][] keypad = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {-1,0,-1}
        };
        System.out.println(isEasyToDail(keypad, "0125-8748"));
    }

    public static boolean isEasyToDail(int[][] keypad, String input) {
        if (input == null || input.length() == 0) {
            return false;
        }

        for (int i=0; i< keypad.length; i++) {
            for(int j=0; j< keypad[0].length; j++) {
                char currentChar = input.charAt(0);
                if (!Character.isDigit(currentChar)) {
                    break;
                }
                if(currentChar - '0' == keypad[i][j]) { // find the first character in the input
                    return isEasyToDailHelper(keypad, i, j, input, 0);
                }
            }
        }
        return false;
    }

    private static boolean isEasyToDailHelper(int[][] keypad, int i, int j, String input, int index) {
        if (i<0 || j<0 || i>=keypad.length || j>=keypad[0].length || input.charAt(index) - '0' != keypad[i][j]) {
            return false;
        }
        if(index == input.length()-1) {
            return true;
        }
        index++;
        if(input.charAt(index) == '-') {
            index++;
        }
        // Search if the next number is same as previous number or present in the 8 directions
        return isEasyToDailHelper(keypad, i, j, input, index) ||
                isEasyToDailHelper(keypad, i + 1, j, input, index) ||
                isEasyToDailHelper(keypad, i - 1, j, input, index) ||
                isEasyToDailHelper(keypad, i, j + 1, input, index) ||
                isEasyToDailHelper(keypad, i, j - 1, input, index) ||
                isEasyToDailHelper(keypad, i+1, j + 1, input, index) ||
                isEasyToDailHelper(keypad, i-1, j - 1, input, index) ||
                isEasyToDailHelper(keypad, i+1, j - 1, input, index) ||
                isEasyToDailHelper(keypad, i-1, j + 1, input, index);
    }
}
