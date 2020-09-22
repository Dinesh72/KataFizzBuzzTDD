class  fizzbuzz{

public boolean isDivisibleby_3(int number)
{
    Boolean status=false;
    Integer checknumber;
   if(number%3==0)
   {
       status=true;
   }
   else
   {
       status=false;
   }
    
    return status;
    
}
public boolean isDivisibleby_5(int number)
{
    Boolean status=false;
    Integer checknumber;
   if(number%5==0)
   {
       status=true;
   }
   else
   {
       status=false;
   }
    
    return status;
    
}
}