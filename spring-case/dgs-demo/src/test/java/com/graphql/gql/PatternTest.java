package com.graphql.gql;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {

        String str = "123456789";
        System.out.println(str.matches("\\d+"));
        Pattern pattern1 = Pattern.compile("\\d+");
        System.out.println(pattern1.matcher(str).matches());

        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}"); // 匹配SSN格式
        Matcher matcher = pattern.matcher("123-45-6789");
        // 搜索和查找匹配
        if (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
        if (matcher.matches()) {
            System.out.println("The entire string matches the pattern.");
        }
        System.out.println("--------------");
        // 替换

        String input = "Hello World! Hello Universe!";
        String output = input.replaceAll("Hello", "Hi");
        System.out.println(output); // 输出: Hi World! Hi Universe!
        System.out.println("--------------");
        // 分组 正则表达式中的圆括号可以用来创建分组
        Pattern p = Pattern.compile("(\\d{3})-(\\d{2})-(\\d{4})");
        Matcher m = p.matcher("123-45-6789");
        if (m.matches()) {
            System.out.println("Area: " + m.group(1));
            System.out.println("Group: " + m.group(2));
            System.out.println("Serial: " + m.group(3));
        }
        System.out.println("--------------");
        // 字符串分割
        String[] parts = Pattern.compile(",").split("apple,banana,grape");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
