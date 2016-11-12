
/**
 * Emulates ElapsedTime class from iRads opMode.
 * Keeps track of time, using System libraries instead of ftc/android libraries.
 *
 * @author Mr. Ashley Trowell
 * @version 11/11/2016
 */
public class ElapsedTime
{

    private double offsetTime = 0.0;


   public double time() {
       // Return current time - offsetTime.
       return ((System.nanoTime()/Math.pow(10,9)) - offsetTime);
    }

   public void reset() {
       // Reset '0' point.
       offsetTime = (System.nanoTime()/Math.pow(10,9));
    }

}
