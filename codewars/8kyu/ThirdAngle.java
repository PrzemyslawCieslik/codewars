public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        int sum =180 - angle1 - angle2;
        if (angle1 + angle2 == 180){
            System.out.println("angle doesn't exist");
        }
        else{
            return sum;
        }
        return sum;
    }
}
