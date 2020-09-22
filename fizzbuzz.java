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
    System.out.println("Number "+number);
    return status;
    
}
}
