/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Huong Thu Tran
 */
public class catAnh {
    public static void join(String inputPath, String outputPath) throws IOException {
        //mở file
        File directory = new File(inputPath);
        // lấy tất cả các file trong thư mục
        File[] files = directory.listFiles();
        
        //lấy thông tin của 1 hình nhỏ chiều rộng chiều cao
        BufferedImage sprite = ImageIO.read(files[0]);
        
        int width = sprite.getWidth();
        int height = sprite.getHeight();
 
        BufferedImage spriteMap = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = spriteMap.createGraphics();
        int x = 0;
        for (File file : files) {
            sprite = ImageIO.read(file);
            g2d.drawImage(sprite, null, x, 0);
            x+=sprite.getWidth();
        }
        //ghi spriteMap
        ImageIO.write(spriteMap, "png", new File(outputPath));    
    }
}
