/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatif;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.;
/**
 *
 * @author A308763
 */
public class SplitMultiTiff {
    public static void main(String[] args) throws IOException {
        // Load the multi-page TIFF image
        RenderedOp op = JAI.create("fileload", "multipage.tif");

        // Get the number of pages in the TIFF image
        int numPages = op.getNumImages();

        // Split the TIFF image into two separate images
        RenderedOp image1 = op.createChild(0, 0, op.getWidth(), numPages/2, 0, 0, op.getWidth(), numPages/2);
        RenderedOp image2 = op.createChild(0, numPages/2, op.getWidth(), numPages - numPages/2, 0, numPages/2, op.getWidth(), numPages - numPages/2);

        // Save the two images as separate TIFF files
        ImageIO.write(image1.getAsBufferedImage(), "tif", new File("image1.tif"));
        ImageIO.write(image2.getAsBufferedImage(), "tif", new File("image2.tif"));
    }
}
