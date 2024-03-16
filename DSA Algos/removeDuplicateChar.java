public class removeDuplicateChar {
    // function to remove duplicate characters from a string using recursion
    public static StringBuilder uniqueString(String a, boolean track[], StringBuilder sb, int index) {
        if (index == a.length()) {
            return sb;
        }

        if(track[a.charAt(index) - 'a'] ==true){
            
            return uniqueString(a, track, sb, index + 1);
        }
        else{
            track[a.charAt(index) - 'a'] = true;
                sb.append(a.charAt(index));
                return uniqueString(a, track, sb, index + 1);
            }
        

        

    }

    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");
        String s = "kyaahaalchaal";
        System.out.println(uniqueString(s, map, sb, 0));

    }

}
