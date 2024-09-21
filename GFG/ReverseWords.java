package GFG;

public class ReverseWords {
    String reverseWords(String str) {
        // code here
        String arr[] = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(arr[i]);
            } else {

                sb.append(arr[i] + ".");
            }

        }
        String rs = sb.toString();
        return rs;
    }

}
