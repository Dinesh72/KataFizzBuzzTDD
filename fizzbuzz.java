class  fizzbuzz{

    public static boolean contains_3(int number)
    {
        return ((number%10==3?true:false));
//     if(number%10==3)
//         return true;
//         else
//         return false;
    }
    public static boolean contains_5(int number)
    {
        return ((number%10==5?true:false));
//     if(number%10==5)
//         return true;
//         else
//         return false;
    }
    public static boolean isDivisibleby_3and5(int number)
{
    return ((number%3==0) && (number%5==0) ?true:false);
//    Boolean status=false;
//    Integer checknumber;
//   if(number%3==0 && number%5==0)
//   {
//       status=true;
//   }
//   else
//   {
//       status=false;
//   }
//    
//    return status;
    
}
public static boolean isDivisibleby_3(int number)
{
    return ((number%3==0?true:false));
//    Boolean status=false;
//    Integer checknumber;
//   if(number%3==0)
//   {
//       status=true;
//   }
//   else
//   {
//       status=false;
//   }
//    
//    return status;
    
}
public static boolean isDivisibleby_5(int number)
{
    return ((number%5==0?true:false));
//    Boolean status=false;
//    Integer checknumber;
//   if(number%5==0)
//   {
//       status=true;
//   }
//   else
//   {
//       status=false;
//   }
//    
//    return status;
//    
}
}
