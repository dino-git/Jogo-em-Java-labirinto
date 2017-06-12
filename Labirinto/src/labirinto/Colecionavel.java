/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author a21606839
 */
public class Colecionavel {
    Image img;
    int x, y;
    Labirinto labirinto;
    Labirinto2 labirinto2;
    
    public Colecionavel(int x, int y, Labirinto lab){
        this.x = x;
        this.y = y;
        labirinto = lab;
    }
    
    public Colecionavel(int x, int y, Labirinto2 lab){
        this.x = x;
        this.y = y;
        labirinto2 = lab;
    }
    
    public void desenha(Graphics g) {
        g.drawImage(img, x, y, labirinto.p);
    }
    
}
