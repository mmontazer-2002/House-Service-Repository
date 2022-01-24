package service.util;

/**
 * Created by Mahdie Montazeralzohoor on 1/12/2022 5:39 PM
 */
public class ValidationUtil {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^(\\+98|0)?9\\d{9}$");
    }

    public static boolean isLetter(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public static boolean isNumeric(String input) {
        return input.matches("[0-9]+");
    }

    public static boolean isDouble(String input) {
        return input.matches("-?\\d+(.\\d+)?");
    }

    public static boolean isAlphabetic(String input) {
        return input.matches("^[a-zA-Z0-9]+$");
    }

    public static boolean isValidUsername(String input) {
        return input.matches("^[A-Za-z]\\w{4,29}$");
    }

    public static boolean isIranianNationalCode(String input) {
        if (input.length() == 10) {
            int sum = 0;
            int value = 10;
            for (int i = 0; i < 10; i++) {
                sum = sum + Character.getNumericValue(input.charAt(i)) * value;
                value--;
            }
            if (sum % 11 == 0) {
                return true;
            }
        } else if (input.length() == 9) {
            int sum = 0;
            int value = 9;
            for (int i = 0; i < 9; i++) {
                sum = sum + Character.getNumericValue(input.charAt(i)) * value;
                value--;
            }
            if (sum % 11 == 0) {
                return true;
            }
        } else if (input.length() == 9) {
            int sum = 0;
            int value = 8;
            for (int i = 0; i < 8; i++) {
                sum = sum + Character.getNumericValue(input.charAt(i)) * value;
                value--;
            }
            if (sum % 11 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidFormatDate(String input) {
        return input.matches("[0-9]{4}(-)[0-9]{1,2}(-)[0-9]{1,2}");

    }

    public static boolean isValidEmail(String input) {
        return input.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
    }

    public static boolean isPassword(String input) {
        return input.matches("^(?=.[A-Za-z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
    }

}
