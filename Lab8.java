import java.awt.Color;

public class Lab8 {

    // ------------------------------------------------------------------------
    // Tests
    // ------------------------------------------------------------------------

    public static void testOverlay() {

        Image img1 = new Image("images/pixel-heart.png");
        Image borderedImg1 = img1.squareOverlay(4);
        borderedImg1.explore();

        Image img2 = new Image("images/crane.jpg");
        Image borderedImg2 = img2.squareOverlay(4);
        borderedImg2.explore();
    }

    public static void testRotation() {

        // Flip the image and visualize the result
        Image img1 = new Image("images/pixel-heart.png");
        Image rotatedImg1 = img1.rotateClockwise90();
        rotatedImg1.explore();

        Image img2 = new Image("images/crane.jpg");
        Image rotatedImg2 = img2.rotateClockwise90();
        rotatedImg2.explore();

    }

    // ------------------------------------------------------------------------
    // Main Method
    // ------------------------------------------------------------------------

    public static void main(String[] args) {
        // You may want to uncomment one test at a time

        // testOverlay();
        // testRotation();
    }
}
