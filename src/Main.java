public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(794));

        System.out.println("byte: " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println("short: " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println("long: " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.println("float: " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.println("double: " + Double.MAX_VALUE + " " + Double.MIN_VALUE);

    }

    public static Integer sumDigits(Integer number)
    {
        String num = number.toString();
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            String ch = "";
            ch += num.charAt(i);
            result += Integer.parseInt(ch);
        }
        return result;
    }

    //Тут могла быть фунция, но Джава, кажется, не может применить MAX_VALUE к числовому классу, который не задан строго заранее, без копипаста не получилось
    // возможная причина - MAX_VALUE не задан в классе Number (а мог бы быть задан абстрактным статическим, и тогда это должно было бы сработать)

//  public static void printMaxMin(Number obj){
//        System.out.println(obj.getClass(). + ": " + obj. + " " + obj.getClass().);
//    }


}
