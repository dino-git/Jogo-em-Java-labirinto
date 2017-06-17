package labirinto;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Labirinto1 extends Labirinto {
    
    public void Proxima() {
        boneco.x = 16;
        boneco.y = 6;
        boneco = null;
        this.dispose();
        Labirinto2 l = new Labirinto2();
        l.setVisible(true);
    }
    
    public ArrayList<NextScene> ProximaCena() {
        nextScene = new ArrayList<NextScene>();
        nextScene.add(new NextScene(548,550, this));
        return nextScene;
    }
    
    public ArrayList<Parede> Paredes() {
        listaParedes = new ArrayList<Parede>();
        
        //Paredes Verticais
        listaParedes.add(new Parede(0, 0, 5, 600, false,46, "v"));
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
        listaParedes.add(new Parede(595, 0, 5, 600, false,47,"v"));
        
        //Paredes falsas
        listaParedes.add(new Parede(115, 295, 10, 70 , true , 39, "v"));
        listaParedes.add(new Parede(175, 5  , 10, 60 , true , 40, "v"));
        listaParedes.add(new Parede(355, 535, 10, 60 , true , 41, "v"));
        listaParedes.add(new Parede(415, 295, 10, 70 , true , 42, "v"));
        listaParedes.add(new Parede(535, 115, 10, 70 , true , 43, "v"));


        //Paredes horizontais 
        listaParedes.add(new Parede(0, 0, 600, 5, false,48,"h"));
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
        listaParedes.add(new Parede(0, 595, 600, 5, false,49,"h"));
        
        //Paredes falsas
        listaParedes.add(new Parede(475, 415, 60 , 10, true , 44, "h"));
        listaParedes.add(new Parede(535, 535, 60 , 10, true , 45, "h"));
        
        return listaParedes;
    }
    
    public static void main(String[] args) {
        Labirinto1 lab = new Labirinto1();
        lab.setVisible(true);
        lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
