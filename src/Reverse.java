public class Reverse {
    public static String reverse(String str)
    {
        if(str.length() < 1)
        {
            return "";
        }

        else
        {
            String result = str.substring(str.length()-1) + reverse(str.substring(0,str.length()-1));
            return result;
        }
    }
}
