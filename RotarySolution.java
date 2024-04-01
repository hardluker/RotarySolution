public class Rotary {


    public void rotate(double startPosition, double inputValue) {
        double difference = inputValue - startPosition;
        double distanceToTravel = inputValue;

        //Rotate Clockwise in positive direction.
        //This is for handling positive inputs
        if (difference > 0) {
            if (startPosition > 0 && difference > 360) {
                double initialStep = 360 - startPosition;
                System.out.println("Move to position 360.00, the controller should now reset to 0.00");
                distanceToTravel -= initialStep;
            }
            while (distanceToTravel > 360) {
                System.out.println("Move to position 360.00, the controller should now reset to 0.00");
                distanceToTravel -= 360;
            }
                System.out.println("Move to position " + distanceToTravel);


        }

        // Rotate Counterclockwise in negative direction.
        // This is for handling negative inputs
        if (difference < 0) {
            if (startPosition < 0 && difference > -360) {
                double initialStep = 0 - startPosition;
                System.out.println("Move to position 0.00, the controller should now reset to 360.00");
                distanceToTravel += initialStep;
            }
            while (distanceToTravel < 0) {
                System.out.println("Move to position 0.00, the controller should now reset to 360.00");
                distanceToTravel += 360;
            }
            System.out.println("Move to position " + distanceToTravel);

        }
    }
}