package labirinto;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Labirinto3 extends Labirinto{
    
    public void Proxima() {
        boneco.x = 16;
        boneco.y = 6;
        boneco = null;
        this.dispose();
        TelaWin t = new TelaWin();
        t.setVisible(true);
    }
    
    public ArrayList<NextScene> ProximaCena() {
        nextScene = new ArrayList<NextScene>();
        nextScene.add(new NextScene(548,550, this));
        return nextScene;
    }
    
    public ArrayList<Parede> Paredes() {
        listaParedes = new ArrayList<Parede>();
        
        //Paredes Verticais
        listaParedes.add(new Parede(0, 0, 5, 600, false,52,"v"));
        listaParedes.add(new Parede(55 , 175, 10, 70, false, 1 , "v"));
        listaParedes.add(new Parede(55 , 295, 10, 70, false, 2 , "v"));
        listaParedes.add(new Parede(55 , 415, 10, 70, false, 3 , "v"));
        listaParedes.add(new Parede(115 , 5, 10, 120, false, 4 , "v"));
        listaParedes.add(new Parede(115 , 235, 10, 70, false, 5 , "v"));
        listaParedes.add(new Parede(115 , 355, 10, 70, false, 6, "v"));
        listaParedes.add(new Parede(115 , 475, 10, 70, false, 7 , "v"));
        listaParedes.add(new Parede(175 , 55, 10, 130, false, 8 , "v"));
        listaParedes.add(new Parede(175 , 295, 10, 70, false, 9 , "v"));
        listaParedes.add(new Parede(175 , 535, 10, 60, false, 10 , "v"));
        listaParedes.add(new Parede(235 , 55, 10, 70, false, 11 , "v"));
        listaParedes.add(new Parede(235 , 175, 10, 130, false, 12 , "v"));
        listaParedes.add(new Parede(235 , 355, 10, 180, false, 13 , "v"));
        listaParedes.add(new Parede(295 , 5, 10, 60, false, 14 , "v"));
        listaParedes.add(new Parede(295 , 115, 10, 70, false, 15 , "v"));
        listaParedes.add(new Parede(295 , 295, 10, 130, false, 16 , "v"));
        listaParedes.add(new Parede(295 , 535, 10, 60, false, 17 , "v"));
        listaParedes.add(new Parede(355 , 55, 10, 70, false, 18 , "v"));
        listaParedes.add(new Parede(355 , 235, 10, 70, false, 19 , "v"));
        listaParedes.add(new Parede(355 , 415, 10, 130, false, 20 , "v"));
        listaParedes.add(new Parede(415 , 295, 10, 180, false, 21 , "v"));
        listaParedes.add(new Parede(415 , 535, 10, 60, false, 22 , "v"));
        listaParedes.add(new Parede(475 , 55, 10, 130, false, 23 , "v"));
        listaParedes.add(new Parede(475 , 415, 10, 130, false, 24 , "v"));
        listaParedes.add(new Parede(535 , 295, 10, 300, false, 25 , "v"));
        listaParedes.add(new Parede(595, 0, 5, 600, false,53,"v"));
        
        //Paredes falsas
        listaParedes.add(new Parede(415, 5  , 10, 55 , true , 47, "v"));
        listaParedes.add(new Parede(415, 175  , 10, 60 , true , 48, "v"));
        listaParedes.add(new Parede(475, 235  , 10, 60 , true , 49, "v"));

        //Paredes horizontais 
        listaParedes.add(new Parede(0, 0, 600, 5, false,54,"h"));
        listaParedes.add(new Parede(5  , 55 , 60 , 10, false, 26, "h"));
        listaParedes.add(new Parede(175  , 55 , 70 , 10, false, 27, "h"));
        listaParedes.add(new Parede(415  , 55 , 130 , 10, false, 28, "h"));
        listaParedes.add(new Parede(55  , 115 , 70 , 10, false, 29, "h"));
        listaParedes.add(new Parede(235  , 115 , 180 , 10, false, 30, "h"));
        listaParedes.add(new Parede(535  , 115 , 60 , 10, false, 31, "h"));
        listaParedes.add(new Parede(55  , 175 , 130 , 10, false, 32, "h"));
        listaParedes.add(new Parede(355  , 175 , 190 , 10, false, 33, "h"));
        listaParedes.add(new Parede(175  , 235 , 250 , 10, false, 34, "h"));
        listaParedes.add(new Parede(475  , 235 , 120 , 10, false, 35, "h"));
        listaParedes.add(new Parede(55  , 295 , 130 , 10, false, 36, "h"));
        listaParedes.add(new Parede(415  , 295 , 70 , 10, false, 37, "h"));
        listaParedes.add(new Parede(175  , 355 , 70 , 10, false, 38, "h"));
        listaParedes.add(new Parede(295  , 355 , 130 , 10, false, 39, "h"));
        listaParedes.add(new Parede(475  , 355 , 70 , 10, false, 40, "h"));
        listaParedes.add(new Parede(5  , 415 , 170 , 10, false, 41, "h"));
        listaParedes.add(new Parede(115  , 475 , 130 , 10, false, 42, "h"));
        listaParedes.add(new Parede(295  , 475 , 70 , 10, false, 43, "h"));
        listaParedes.add(new Parede(415  , 475 , 70 , 10, false, 44, "h"));
        listaParedes.add(new Parede(55  , 535 , 70 , 10, false, 45, "h"));
        listaParedes.add(new Parede(355  , 535 , 70 , 10, false, 46, "h"));
        listaParedes.add(new Parede(0, 595, 600, 5, false,55,"h"));
        
        //Paredes falsas
        listaParedes.add(new Parede(5, 235, 55 , 10, true , 50, "h"));
        listaParedes.add(new Parede(235, 415, 60 , 10, true , 51, "h"));
        
        return listaParedes;
    }
    
    public static void main(String[] args) {
        Labirinto3 lab = new Labirinto3();
        lab.setVisible(true);
        lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
