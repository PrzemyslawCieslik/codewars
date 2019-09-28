public class Troll {
    public static String disemvowel(String str) {
        String removingVowel = str.replaceAll("[aeiouAEIOU]", "");
        return removingVowel;
    }
}
