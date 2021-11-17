package me.template.restapi.common;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 15 오후 4:42
 */
public class TypeValidator {

    /**
     * 인자값이 정수형인지 확인하는 함수
     */
    public static boolean isInteger(String strInt) {
        if (strInt == null) {
            return false;
        }

        try {
            int i = Integer.parseInt(strInt);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * ISBN 13 문자열인지 확인
     */
    public static boolean isISBN13(String strIsbn) {
        if (strIsbn == null || "".equals(strIsbn)) {
            return false;
        }

        int n = strIsbn.length();
        if ( n != 13 ) {
            return false;
        }

        int sum = 0;
        for (int i = 0 ; i < 13; i++ ) {
            int digit = strIsbn.charAt(i) - '0'; // convert char to int
            if ( i % 2 == 1 ) { // i is odd number
                sum += digit * 3;
            } else {
                sum += digit * 1;
            }
        }

        if ( sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidLengthStr(int len, String paramStr) {

        if (paramStr == null || "".equals(paramStr) ) {
            if (len == 0) return true;
            return false;
        }

        if ( paramStr.length() == len ) return true;
        return false;
    }

}