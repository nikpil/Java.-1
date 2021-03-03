/* Подсмотрел(
Было ясно, что надо использовать if. Но не было понятно как посчитать.
предыдущие семь были решины самостоятельно
 */
public class HW_8
{
    public static void main(String[] args)
    {
        int year=100;
        if (year %100==0 && year %400 ==0 )
            System.out.println("год високосный");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("год високосный");

        else if (year % 100 == 0)
            System.out.println("год не високосный");

        else
            System.out.println("год не високосный");


    }
}
