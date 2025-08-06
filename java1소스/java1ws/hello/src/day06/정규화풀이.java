package day06;

import java.util.regex.Pattern;

public class 정규화풀이 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d+$");

        String test1 = "12345";    // 숫자만 있음 -> 매칭됨
        String test2 = "123abc";   // 문자 포함 -> 매칭 안 됨
        String test3 = " 123 ";    // 공백 포함 -> 매칭 안 됨
        String test4 = "";         // 빈 문자열 -> 매칭 안 됨
        String test5 = "012345";   // 숫자만 있음 -> 매칭됨

        System.out.println(pattern.matcher(test1).matches()); // true
        System.out.println(pattern.matcher(test2).matches()); // false
        System.out.println(pattern.matcher(test3).matches()); // false
        System.out.println(pattern.matcher(test4).matches()); // false
        System.out.println(pattern.matcher(test5).matches()); // true
    }
}
