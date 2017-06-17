package labirinto;

import java.awt.Color;
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

public class Labirinto extends JFrame implements KeyListener, ActionListener {
    
    MeuPainel p;
    Image fundo, imgBoneco;
    Timer relogio;
    static ArrayList<Integer> listaTeclas;
    Boneco boneco;
    static ArrayList<Parede> listaParedes;
    static ArrayList<NextScene> nextScene;
    static ArrayList<Colecionavel> listaColecionavels;
    String nomeProximaCena;
    
    public Labirinto() {
        fundo = lerImagem("fundo.jpg");
        setSize(617, 639);
        setLocationRelativeTo(getComponent((int) CENTER_ALIGNMENT));
        p = new MeuPainel();
        add(p);
        boneco = new Boneco(this);
        listaTeclas = new ArrayList<Integer>();
        relogio = new Timer(40, this);
        relogio.start();
        p.addKeyListener(this);
        
        listaParedes = Paredes();
        listaColecionavels = Colecionaveis();
        nextScene = ProximaCena();
    }
    
    public void Proxima() {
        this.dispose();
    }
    
    public ArrayList<Colecionavel> Colecionaveis() {
        listaColecionavels = new ArrayList<Colecionavel>();
        return listaColecionavels;
    }
    
    public ArrayList<NextScene> ProximaCena() {
        nextScene = new ArrayList<NextScene>();
        return nextScene;
    }
    
    public ArrayList<Parede> Paredes() {
        listaParedes = new ArrayList<Parede>();
        return listaParedes;
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
        /*Labirinto lab = new Labirinto();
        lab.setVisible(true);
        lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
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
        if(boneco != null){
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
        
        for (NextScene n: nextScene) {
            Rectangle rNext = n.getRectangle();
            if(rNext.intersects(boneco.getRectangle())) Proxima();
        }
        boneco.update();
        repaint();
        }
    }
    
    class MeuPainel extends JPanel {
        @Override
        public void paintComponent(Graphics g){
            g.drawImage(fundo, 0, 0, this);
            g.setColor(Color.blue);
            g.fillRect(0, 0, 600,600);
            for(Parede p: listaParedes)
                p.desenha(g);
            for(Colecionavel c: listaColecionavels)
                c.desenha(g);
            for(NextScene n: nextScene)
                n.desenha(g);
            this.requestFocus();
        }
    }   
}
