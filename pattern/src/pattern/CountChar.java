package pattern;

public class CountChar 
{
	public static void main(String[] args) {
        String input = "@Softtronics training#?!";
        String output = "";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                output += c;
            } else {
                count++;
            }
        }
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + output);
        System.out.println("Number of special characters removed: " + count);
    }
}
