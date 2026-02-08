package Array;

public class armstrong {
    public static void main(String[] args) {
        int num = 10;
        int arm = 0;
        int count = 0;
        int original = num;
        String c = String.valueOf(num);
        int len = c.length();
        int a = 0;
        while (num > 0) {
            a = num % 10;
            num /= 10;
            for (int i = 1; i <= len; i++) {
                a = a + i;
                arm += a;
            }
        }

        if (original == arm) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

