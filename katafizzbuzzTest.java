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
    //     fizzbuzz test1=new fizzbuzz();


         for(int i=1;i<=100;i++)
         {

             try{
            Assert.assertTrue(fizzbuzz.isDivisibleby_3and5(i));
            System.out.println("FizzBuzz");
             }
             catch(AssertionError e)
             {

                  try{
            Assert.assertTrue(fizzbuzz.contains_3(i));
            System.out.println("Fizz");
             }
             catch(AssertionError e4)
             {
                try{
            Assert.assertTrue(fizzbuzz.contains_5(i));
            System.out.println("Buzz");
             }
             catch(AssertionError e5)
             {

               try{

            Assert.assertTrue(fizzbuzz.isDivisibleby_3(i));
            System.out.println("Fizz");
             }
             catch(AssertionError e2)
             {
                 try{

            Assert.assertTrue(fizzbuzz.isDivisibleby_5(i));
            System.out.println("Buzz");
             }
             catch(AssertionError e3)
             {
                 System.out.println(i);
             }
             }
             }


             }

         }

        }
         }
    }

