package p22_括号生成;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        S1 solution = new S1();
        int num = 3;
        List<String> strings = solution.generateParenthesis(num);
        System.out.println(strings);

    }

}
