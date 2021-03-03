public class HW_3
{
    public static void main(String[] args) {

        float a = 0.25F;
        float b = 1.2F;
        float c = 44.1F;
        float d = -0.3F;

        System.out.println("x = "+ add(a,b,c,d));
    }

    public static float add(float a, float b, float c, float d)
    {
        return a * (b + (c / d));

    }
}
