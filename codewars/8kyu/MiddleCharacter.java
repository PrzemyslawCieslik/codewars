public class MiddleCharacter {
    public static String getMiddle(String word) {
        int position;
        int length;

        if (word.length() % 2 == 1) {
            position = word.length() / 2;
            length = 1;
        } else {
            position = word.length() / 2 - 1;
            length = 2;
        }
        String result = word.substring(position, position + length);
        return result;
    }

}
