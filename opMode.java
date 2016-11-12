
/**
 * Emulates a iRads opMode class.
 *
 * @author Mr. Ashley Trowell
 * @version 11/11/2016
 */
public class opMode
{
    public Hardware_iRads robot = new Hardware_iRads();
    public ElapsedTime runtime = new ElapsedTime();
    public Telemetry telemetry = new Telemetry();
    public EncoderNavigation encoderNav = new EncoderNavigation();

    public opMode() {
        runtime.reset(); // Normally this would run inside runOpMode
        encoderNav.initialize(robot,runtime,telemetry);
    }


    public void runOpMode() {

        telemetry.addData("Status","Running");
        telemetry.addData("robotWidth",String.format("%.1f mm",robot.WHEELBASE_WIDTH_MM));
        telemetry.addData("time",String.format("%.3f",runtime.time()) + " seconds\n");
        
        encoderNav.setSteps(-700,700);
        encoderNav.printResults();
        telemetry.addData("","\n");

    }

}
