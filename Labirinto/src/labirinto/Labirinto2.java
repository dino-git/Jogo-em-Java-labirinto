package labirinto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Labirinto2 extends JFrame implements KeyListener, ActionListener {
    
    MeuPainel p;
    Image fundo, imgBoneco;
    Timer relogio;
    ArrayList<Integer> listaTeclas;
    Boneco boneco;
    ArrayList<Parede> listaParedes;
    ArrayList<Colecionavel> listaColecionavels;
    
    public Labirinto2() {
        fundo = lerImagem("fundo.jpg");
        setSize(617, 639);
        p = new MeuPainel();
        add(p);
        boneco = new Boneco(this);
        listaTeclas = new ArrayList<Integer>();
        relogio = new Timer(40, this);
        relogio.start();
        p.addKeyListener(this);
        
        listaParedes = new ArrayList<Parede>();
        
        //Paredes Verticais
                //listaParedes.add(new Parede(0, 0, 5, 600, false,39));
                listaParedes.add(new Parede(55 , 175, 10, 130, false, 1 , "v"));
                listaParedes.add(new Parede(55 , 355, 10, 180, false, 2 , "v"));
                listaParedes.add(new Parede(115, 55 , 10, 70 , false, 3 , "v"));
                listaParedes.add(new Parede(115, 235, 10, 70 , false, 4 , "v"));
                listaParedes.add(new Parede(115, 415, 10, 70 , false, 5 , "v"));
                listaParedes.add(new Parede(175, 55 , 10, 130, false, 6 , "v"));
                listaParedes.add(new Parede(175, 295, 10, 120, false, 7 , "v"));
                listaParedes.add(new Parede(235, 55 , 10, 130, false, 8 , "v"));
                listaParedes.add(new Parede(235, 295, 10, 70 , false, 9 , "v"));
                listaParedes.add(new Parede(235, 475, 10, 70 , false, 10, "v"));
                listaParedes.add(new Parede(295, 55 , 10, 310, false, 11, "v"));
                listaParedes.add(new Parede(295, 415, 10, 70 , false, 12, "v"));
                listaParedes.add(new Parede(355, 5  , 10, 300, false, 13, "v"));
                listaParedes.add(new Parede(415, 55 , 10, 70 , false, 14, "v"));
                listaParedes.add(new Parede(415, 175, 10, 130, false, 15, "v"));
                listaParedes.add(new Parede(415, 415, 10, 130, false, 16, "v"));
                listaParedes.add(new Parede(475, 235, 10, 70 , false, 17, "v"));
                listaParedes.add(new Parede(475, 355, 10, 70 , false, 18, "v"));
                listaParedes.add(new Parede(475, 474, 10, 125, false, 19, "v"));
                listaParedes.add(new Parede(535, 295, 10, 250, false, 20, "v"));
                
                //Paredes falsas
                listaParedes.add(new Parede(115, 295, 10, 70 , true , 39, "v"));
                listaParedes.add(new Parede(175, 5  , 10, 60 , true , 40, "v"));
                listaParedes.add(new Parede(355, 535, 10, 60 , true , 41, "v"));
                listaParedes.add(new Parede(415, 295, 10, 70 , true , 42, "v"));
                listaParedes.add(new Parede(535, 115, 10, 70 , true , 43, "v"));
                //listaParedes.add(new Parede(595, 0, 5, 600, false,40));

                //Paredes horizontais 
                //listaParedes.add(new Parede(0, 0, 600, 5, false,41));
                listaParedes.add(new Parede(5  , 55 , 60 , 10, false, 21, "h"));
                listaParedes.add(new Parede(235, 55 , 70 , 10, false, 22, "h"));
                listaParedes.add(new Parede(415, 55 , 130, 10, false, 23, "h"));
                listaParedes.add(new Parede(5  , 115, 110, 10, false, 24, "h"));
                listaParedes.add(new Parede(415, 115, 130, 10, false, 25, "h"));
                listaParedes.add(new Parede(55 , 175, 120, 10, false, 26, "h"));
                listaParedes.add(new Parede(415, 175, 130, 10, false, 27, "h"));
                listaParedes.add(new Parede(115, 235, 180, 10, false, 28, "h"));
                listaParedes.add(new Parede(535, 235, 60 , 10, false, 29, "h"));
                listaParedes.add(new Parede(175, 295, 70 , 10, false, 30, "h"));
                listaParedes.add(new Parede(475, 295, 70 , 10, false, 31, "h"));
                listaParedes.add(new Parede(55 , 355, 70 , 10, false, 32, "h"));
                listaParedes.add(new Parede(295, 355, 130, 10, false, 33, "h"));
                listaParedes.add(new Parede(115, 415, 250, 10, false, 34, "h"));
                listaParedes.add(new Parede(415, 415, 70 , 10, false, 35, "h"));
                listaParedes.add(new Parede(115, 475, 70 , 10, false, 36, "h"));
                listaParedes.add(new Parede(295, 475, 120, 10, false, 37, "h"));
                listaParedes.add(new Parede(55 , 535, 310, 10, false, 38, "h"));
                
                //Paredes falsas
                listaParedes.add(new Parede(475, 415, 60 , 10, true , 44, "h"));
                listaParedes.add(new Parede(535, 535, 60 , 10, true , 45, "h"));
                //listaParedes.add(new Parede(0, 595, 600, 5, false,42));
        
        listaColecionavels = new ArrayList<Colecionavel>();
        
        //abaixo lista de moedas
        listaColecionavels.add(new Moeda(222,340,this));
        
        //abaixo lista de chaves
        listaColecionavels.add(new Chave(222, 440, this));
        listaColecionavels.add(new Chave(322, 540, this));
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
    
    public static void main(String[] args) {
        Labirinto lab = new Labirinto();
        lab.setVisible(true);
        lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        for(Integer t: listaTeclas) {
            if(tecla == t) return;
        }
        listaTeclas.add(tecla);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int tecla = e.getKeyCode();
        listaTeclas.remove(new Integer(tecla));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Integer t: listaTeclas) {
            switch(t) {
                case KeyEvent.VK_LEFT:
                    boneco.esquerda();
                    break;
                case KeyEvent.VK_RIGHT:
                    boneco.direita();
                    break;
                case KeyEvent.VK_UP:
                    boneco.cima();
                    break;
                case KeyEvent.VK_DOWN:
                    boneco.baixo();
                    break;
                case KeyEvent.VK_SPACE:
                    boneco.parar();
                    break;
            }
        }
        if(listaTeclas.isEmpty()) boneco.parar();
        
        for(Parede p: listaParedes) {
            if (p.isInvisible()){
                try {
                    Rectangle rParede = p.getRetangulo();
                    if(rParede.intersects(boneco.getRectangle()) && p.isInvisible()){
                        p.setInvisible(false);
                        System.out.println(p.getNumero());
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Labirinto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
                    
        boneco.update();
        repaint();
    }
    
    class MeuPainel extends JPanel {
        @Override
        public void paintComponent(Graphics g){
            //g.drawImage(fundo, 0, 0, this);
            g.setColor(Color.blue);
            g.fillRect(0, 0, 600,600);
            for(Parede p: listaParedes)
                p.desenha(g);
            for(Colecionavel c: listaColecionavels)
               // c.desenha(g);
            this.requestFocus();
        }
    }
}
