 public class HW_4
 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // в задании нет вывода в консоль
        // System.out.println(check(a, b));

    }

    public static boolean check(int a, int b)
    {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20))
        return true;
        else
        return false;
    }
}
