package p242_有效的字母异位词;

public class Main {
    public static void main(String[] args) {
       /* char str = 'a';
        System.out.println(str + " " + (byte) str);
        System.out.println((char)97);
        System.out.println('a'-'b');*/

//        Solution solution = new Solution();
        Solution2 solution = new Solution2();
        String s = "anagram";
        String t = "nagaram";
        boolean anagram = solution.isAnagram(s, t);
        System.out.println(anagram);
    }


}
