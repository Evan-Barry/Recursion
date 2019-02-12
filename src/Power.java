public class Power {
    public static int myPow(int x, int y)// y >= 0
    {
         if(y < 1)
         {
             return 1;
         }

         else
         {
             int result = x * myPow(x, y-1);
             return result;
         }
    }
}
