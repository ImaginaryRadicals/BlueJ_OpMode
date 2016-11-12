
/**
 * Emulate Hardware_iRads from Android Stuidio project.
 * At present, this class simply hosts robot hardware constants.
 *
 * @author Mr. Ashley Trowell
 * @version 11/11/2016
 */
public class Hardware_iRads
{

    // Robot Hardware Constants
    public static final double LAUNCH_WHEEL_DIAMETER_INCHES =  4;
    public static final double DRIVE_WHEEL_DIAMETER_INCHES  =  4;

    public static final double MM_PER_IN = 25.4f;
    public static final double WHEELBASE_WIDTH_IN = 18;
    public static final double WHEELBASE_WIDTH_MM  = WHEELBASE_WIDTH_IN  * MM_PER_IN;
    public static final double DRIVE_WHEEL_RADIUS_MM = DRIVE_WHEEL_DIAMETER_INCHES /2.0 * MM_PER_IN;
    public static final double DRIVE_WHEEL_MM_PER_ROT = DRIVE_WHEEL_RADIUS_MM * 2 *  Math.PI;

    public static final int DRIVE_WHEEL_STEPS_PER_ROT     = 28*60;
    public static final int LAUNCH_WHEEL_STEPS_PER_ROT    =  28*1 ; // Ticks per rotation
    public static final int LIFT_STEPS_PER_ROT            =  28*60; // Ticks per rotation

    public static final int MAX_DRIVE_SPEED_TPS     =  1680 ; // Ticks per second
    public static final int LIFT_MAX_SPEED_TPS      =  1680 ; // Ticks per second
    public static final int MAX_LAUNCH_SPEED_TPS    =   280 ; // Ticks per second




}
