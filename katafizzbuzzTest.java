
import org.junit.Assert;
import org.junit.Test;

public class katafizzbuzzTest {
    
    

    @Test
     public void fizzbuzztest() {
     fizzbuzz test1=new fizzbuzz();
     String checknumber=null;
     String Status;
     for(int i=1;i<=100;i++)
     {
         try{
        Assert.assertTrue(test1.isDivisibleby_3(i));
         }
         catch(AssertionError e)
         {
             System.out.println(i);
         }
         System.out.println("Fizz");
        
      
         
     }

    }
}
