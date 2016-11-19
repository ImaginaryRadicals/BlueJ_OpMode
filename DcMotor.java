
/**
 * Emulation of FTC DcMotor class outside Android.
 * 
 * @author Mr. Ashley Trowell
 * @version (11/18/2016)
 */
public class DcMotor
{
   private double encoderPosition = 0;
   private int encoderMaxSpeed = 0; //encoderTicksPerSecond
   private double motorPower = 0;
   
   // Simulation support
   // Need way to keep track of time...
   private double lastCommandTimestamp = 0;
   
    void setPower(double motorPower) {
        updateSim();
        this.motorPower = motorPower;
    }
    
    double getPower() {
        return motorPower;
    }
    
    int getCurrentPosition() {
        updateSim();
        return (int) encoderPosition;
    }

    void setMaxSpeed(int encoderTicksPerSecond) {
        this.encoderMaxSpeed = encoderTicksPerSecond;
    }
    
    int getMaxSpeed() {
        return encoderMaxSpeed;
    }

    // Simulation support
    void updateSim() {
        // Use current and previous timestamps, and current motor speed, to update 
        // encoder position. Then update timestamps.
    }
} // DcMotor class
