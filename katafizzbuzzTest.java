
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dinesh
 */
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
         try{
        Assert.assertTrue(test1.isDivisibleby_5(i));
         }
         catch(AssertionError e2)
         {
             System.out.println(i);
         }
         System.out.println("Buzz");
         
     }

    }
}