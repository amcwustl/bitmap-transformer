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
        // chatGPT assisted with the method for making rgb values gray
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

    public void flip() {
        int width = image.getWidth();
        int height = image.getHeight();

        int[] temp = new int[width];
        // chatgpt assisted with the formula for flipping an image
        for (int i=0; i < width;i++){
            for (int j=0; j < height/2; j++){
                int rgb = image.getRGB(i,j);

                temp[j] = rgb;

                image.setRGB(i, j, image.getRGB(i, height - j - 1));
                image.setRGB(i, height - j - 1, temp[j]);
            }
        }
    }

    public void negative() {
        int width = image.getWidth();
        int height = image.getHeight();
        // chatgpt assisted with the formula for making colors their negative
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color pixel = new Color(this.image.getRGB(i, j));

                int red = 255 - pixel.getRed();
                int green = 255 - pixel.getGreen();
                int blue = 255 - pixel.getBlue();
                int alpha = pixel.getAlpha();

                Color newColor = new Color (red, green, blue, alpha);
                image.setRGB(i,j, newColor.getRGB());

            }
        }
    }

    public BufferedImage toBufferedImage() {
        return this.image;
    }
}


