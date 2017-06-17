/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author aulas
 */
public class NextScene {
    Image img = Labirinto.lerImagem("chave.png");
    int x, y;
    Labirinto labirinto;
    Labirinto2 labirinto2;
    
    public NextScene(int x, int y, Labirinto lab){
        this.x = x;
        this.y = y;
        labirinto = lab;
    }
    
    public Rectangle getRectangle() {
        Rectangle r = new Rectangle(x,y,img.getWidth(labirinto),img.getHeight(labirinto));
        return r;
    }
        
    public void desenha(Graphics g) {
        g.drawImage(img, x, y, labirinto.p);
    }
}
