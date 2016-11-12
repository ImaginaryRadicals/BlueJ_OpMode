
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

    public opMode() {
        runtime.reset(); // Normally this would run inside runOpMode
    }


    public void runOpMode() {

        telemetry.addData("Status","Running");
        telemetry.addData("robotWidth",Double.toString(robot.WHEELBASE_WIDTH_IN));
        telemetry.addData("time",String.format("%.3f",runtime.time()));

    }

}
