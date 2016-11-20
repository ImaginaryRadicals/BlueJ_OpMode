
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

        int DIST = 700; //mm

        telemetry.addData("Status","Running");
        telemetry.addData("robotWidth",String.format("%.1f mm",robot.WHEELBASE_WIDTH_MM));
        telemetry.addData("time",String.format("%.3f",runtime.time()) + " seconds\n");

        // No translation 
        encoderNav.setSteps(0,0);
        encoderNav.printResults();
        telemetry.addData("","\n");
        
        encoderNav.setSteps(-DIST,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(DIST,-DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");
 
        encoderNav.setSteps(-DIST+1,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        // Translate without rotation
        encoderNav.setSteps(DIST,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(-DIST,-DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        // Rotating motions
        encoderNav.setSteps(1,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");
        
        encoderNav.setSteps(0,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(-1,DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(DIST,1);
        encoderNav.printResults();
        telemetry.addData("","\n");
 
        encoderNav.setSteps(DIST,0);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(DIST,-1);
        encoderNav.printResults();
        telemetry.addData("","\n");

        // negative DIST
        encoderNav.setSteps(1,-DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");
        
        encoderNav.setSteps(0,-DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(-1,-DIST);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(-DIST,1);
        encoderNav.printResults();
        telemetry.addData("","\n");
 
        encoderNav.setSteps(-DIST,0);
        encoderNav.printResults();
        telemetry.addData("","\n");

        encoderNav.setSteps(-DIST,-1);
        encoderNav.printResults();
        telemetry.addData("","\n");
    }

}
