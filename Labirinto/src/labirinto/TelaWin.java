/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static labirinto.Labirinto.listaParedes;

public class TelaWin extends JFrame{
    
    Image imag;
    Painel p;
    
    public TelaWin() {
        imag = lerImagem("win.png");
        setSize(617, 639);
        setLocationRelativeTo(getComponent((int) CENTER_ALIGNMENT));
        p = new Painel();
        add(p);
    }
    
    public static Image lerImagem(String fich) {
        Image img=null;
        try {
            img = ImageIO.read(new File(fich));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return img;
    }
    
    class Painel extends JPanel {
        @Override
        public void paintComponent(Graphics g){
            g.drawImage(imag, 0, 0, this);
        }
    }
    
    public static void main(String[] args){
        TelaWin t = new TelaWin();
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
