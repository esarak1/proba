import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.CvType;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class bobber {

    public static boolean provjera1(){

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Read the images from the file
        Mat smallImage = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak.png");
        Mat smallImage1 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak1.png");
        Mat smallImage2 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak2.png");
        Mat smallImage3 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak3.png");
        Mat smallImage4 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak4.png");
        Mat smallImage5 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak5.png");
        Mat smallImage6 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak6.png");
        Mat smallImage7 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak7.png");
        Mat smallImage8 = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\plovak8.png");
        Mat largeImage = Imgcodecs.imread("C:\\Users\\Sharky\\IdeaProjects\\proba\\screenshot.png");

        // Perform template matching
        Mat result = new Mat();
        Mat result1 = new Mat();
        Mat result2 = new Mat();
        Mat result3 = new Mat();
        Mat result4 = new Mat();
        Mat result5 = new Mat();
        Mat result6 = new Mat();
        Mat result7 = new Mat();
        Mat result8 = new Mat();
        Imgproc.matchTemplate(largeImage, smallImage, result, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage1, result1, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage2, result2, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage3, result3, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage4, result4, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage5, result5, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage6, result6, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage7, result7, Imgproc.TM_SQDIFF_NORMED);
        Imgproc.matchTemplate(largeImage, smallImage8, result8, Imgproc.TM_SQDIFF_NORMED);

        // Set the similarity threshold
        double similarityThreshold = 0.2; // Adjust the threshold as needed

        // Find the minimum match value
        Core.MinMaxLocResult mmr = Core.minMaxLoc(result);
        double minMatchValue = mmr.minVal;

        Core.MinMaxLocResult mmr1 = Core.minMaxLoc(result1);
        double minMatchValue1 = mmr1.minVal;

        Core.MinMaxLocResult mmr2 = Core.minMaxLoc(result2);
        double minMatchValue2 = mmr2.minVal;

        Core.MinMaxLocResult mmr3 = Core.minMaxLoc(result3);
        double minMatchValue3 = mmr3.minVal;

        Core.MinMaxLocResult mmr4 = Core.minMaxLoc(result4);
        double minMatchValue4 = mmr4.minVal;

        Core.MinMaxLocResult mmr5 = Core.minMaxLoc(result5);
        double minMatchValue5 = mmr5.minVal;

        Core.MinMaxLocResult mmr6 = Core.minMaxLoc(result6);
        double minMatchValue6 = mmr6.minVal;

        Core.MinMaxLocResult mmr7 = Core.minMaxLoc(result7);
        double minMatchValue7 = mmr7.minVal;

        Core.MinMaxLocResult mmr8 = Core.minMaxLoc(result8);
        double minMatchValue8 = mmr8.minVal;

        // Compare the minimum match value to the similarity threshold
        if (minMatchValue <= similarityThreshold || minMatchValue1 <= similarityThreshold || minMatchValue2 <= similarityThreshold || minMatchValue3 <= similarityThreshold || minMatchValue4 <= similarityThreshold || minMatchValue5 <= similarityThreshold || minMatchValue6 <= similarityThreshold || minMatchValue7 <= similarityThreshold || minMatchValue8 <= similarityThreshold) {
            // Small image is inside large image
            return true;
            // You can perform any further actions here, like drawing a rectangle around the match
        } else {
            // Small image is not inside large image
            return false;
        }
    }

    public static void main(String[] args) {
    }
}
