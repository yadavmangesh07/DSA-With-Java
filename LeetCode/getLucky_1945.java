package LeetCode;

public class getLucky_1945 {
    public static int getLucky(String s, int k) {
        int rs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - 'a' + 1 > 9) {
                int temp = s.charAt(i) - 'a' + 1;
                rs += (temp % 10);
                temp = temp / 10;
                rs += temp;

            } else {
                rs += s.charAt(i) - 'a' + 1;
            }

        }
        System.out.println(rs);
        int x = 0;
        while ((k - 1) > 0) {
            x = 0;
            while (rs > 9) {

                x += rs % 10;
                rs = rs / 10;
            }
            x += rs;
            rs = x;
            k--;

        }

        return x == 0 ? rs : x;

    }

    public static void main(String[] args) {
        String s = "vbyytoijnbgtyrjlsc";
        System.out.println(getLucky(s, 2));
    }

}
