package chapter2.capsulation.v2;

public class Robot {
    private boolean leftLeg;
    private boolean rightLeg;
    private boolean rightArm;
    private boolean leftArm;

    public void walk(boolean power){
        this.leftLeg = power;
        this.rightLeg = power;
        this.rightArm = power;
        this.leftArm = power;
    }

}
