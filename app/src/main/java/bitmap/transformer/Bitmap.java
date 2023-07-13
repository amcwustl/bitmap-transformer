package bitmap.transformer;

import java.awt.image.BufferedImage;
import java.awt.*;

public class Bitmap {

    private BufferedImage image;

    public Bitmap(BufferedImage image){
        this.image = image;
    }

    public void grayscale() {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int i=0; i < width; i++){
            for (int j = 0; j < height; j++) {
                Color pixel = new Color(this.image.getRGB(i,j));

                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                int alpha = pixel.getAlpha();

                int gray = (red + green + blue) / 3;
                Color grayColor = new Color (gray, gray, gray, alpha);


                image.setRGB(i,j, grayColor.getRGB());
            }
        }
    }

    public BufferedImage toBufferedImage() {
        return this.image;
    }
}


