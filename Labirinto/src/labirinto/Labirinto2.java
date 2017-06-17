package labirinto;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Labirinto2 extends Labirinto{
    
    public void Proxima() {
        boneco.x = 16;
        boneco.y = 6;
        boneco = null;
        this.dispose();
        Labirinto3 z = new Labirinto3();
        z.setVisible(true);
    }
    
    public ArrayList<NextScene> ProximaCena() {
        nextScene = new ArrayList<NextScene>();
        nextScene.add(new NextScene(548,550, this));
        return nextScene;
    }
    
    public ArrayList<Parede> Paredes() {
        listaParedes = new ArrayList<Parede>();
        
        //Paredes Verticais
        listaParedes.add(new Parede(0, 0, 5, 600, false,56,"v"));
        listaParedes.add(new Parede(55 , 175, 10, 130, false, 1 , "v"));
        listaParedes.add(new Parede(115 , 295, 10, 130, false, 2 , "v"));
        listaParedes.add(new Parede(115, 475 , 10, 70 , false, 3 , "v"));
        listaParedes.add(new Parede(175, 235, 10, 70 , false, 4 , "v"));
        listaParedes.add(new Parede(175, 415, 10, 70 , false, 5 , "v"));
        listaParedes.add(new Parede(175, 535 , 10, 60, false, 6 , "v"));
        listaParedes.add(new Parede(235, 55, 10, 130, false, 7 , "v"));
        listaParedes.add(new Parede(235, 295 , 10, 70, false, 8 , "v"));
        listaParedes.add(new Parede(295, 5, 10, 60 , false, 9 , "v"));
        listaParedes.add(new Parede(295, 115, 10, 130 , false, 10, "v"));
        listaParedes.add(new Parede(295, 355 , 10, 180, false, 11, "v"));
        listaParedes.add(new Parede(355, 55, 10, 70 , false, 12, "v"));
        listaParedes.add(new Parede(355, 175  , 10, 180, false, 13, "v"));
        listaParedes.add(new Parede(355, 535 , 10, 60 , false, 14, "v"));
        listaParedes.add(new Parede(415, 5, 10, 60, false, 15, "v"));
        listaParedes.add(new Parede(415, 235, 10, 180 , false, 16, "v"));
        listaParedes.add(new Parede(415, 475, 10, 70 , false, 17, "v"));
        listaParedes.add(new Parede(475, 55, 10, 70, false, 18, "v"));
        listaParedes.add(new Parede(475, 175, 10, 180, false, 19, "v"));
        listaParedes.add(new Parede(475, 415, 10, 70, false, 20, "v"));
        listaParedes.add(new Parede(535, 5, 10, 60, false, 21, "v"));
        listaParedes.add(new Parede(535, 475, 10, 70, false, 22, "v"));
        listaParedes.add(new Parede(595, 0, 5, 600, false,57,"v"));
        
        //Paredes falsas
        listaParedes.add(new Parede(235, 5  , 10, 60 , true , 49, "v"));
        listaParedes.add(new Parede(475, 535, 10, 60 , true , 50, "v"));
        listaParedes.add(new Parede(535, 115, 10, 60 , true , 51, "v"));

        //Paredes horizontais 
        listaParedes.add(new Parede(0, 0, 600, 5, false,58,"h"));
        listaParedes.add(new Parede(55  , 55 , 180 , 10, false, 23, "h"));
        listaParedes.add(new Parede(5, 115 , 170 , 10, false, 24, "h"));
        listaParedes.add(new Parede(295, 115 , 250, 10, false, 25, "h"));
        listaParedes.add(new Parede(115  , 175, 130, 10, false, 26, "h"));
        listaParedes.add(new Parede(355, 175, 70, 10, false, 27, "h"));
        listaParedes.add(new Parede(535 , 175, 60, 10, false, 28, "h"));
        listaParedes.add(new Parede(115, 235, 180, 10, false, 29, "h"));
        listaParedes.add(new Parede(475, 235, 70, 10, false, 30, "h"));
        listaParedes.add(new Parede(55, 295, 70 , 10, false, 31, "h"));
        listaParedes.add(new Parede(235, 295, 70 , 10, false, 32, "h"));
        listaParedes.add(new Parede(535 , 295, 60 , 10, false, 33, "h"));
        listaParedes.add(new Parede(5, 355, 60, 10, false, 34, "h"));
        listaParedes.add(new Parede(115, 355, 130, 10, false, 35, "h"));
        listaParedes.add(new Parede(295, 355, 70, 10, false, 36, "h"));
        listaParedes.add(new Parede(475, 355, 60, 10, false, 37, "h"));
        listaParedes.add(new Parede(55, 415, 70, 10, false, 38, "h"));
        listaParedes.add(new Parede(175, 415, 70, 10, false, 39, "h"));
        listaParedes.add(new Parede(355, 415, 130, 10, false, 40, "h"));
        listaParedes.add(new Parede(535, 415, 60, 10, false, 41, "h"));
        listaParedes.add(new Parede(5, 475, 60, 10, false, 42, "h"));
        listaParedes.add(new Parede(115, 475, 70 , 10, false, 43, "h"));
        listaParedes.add(new Parede(235, 475, 180 , 10, false, 44, "h"));
        listaParedes.add(new Parede(475, 475, 70 , 10, false, 45, "h"));
        listaParedes.add(new Parede(55 , 535, 70, 10, false, 46, "h"));
        listaParedes.add(new Parede(175 , 535, 70, 10, false, 47, "h"));
        listaParedes.add(new Parede(415 , 535, 70, 10, false, 48, "h"));
        listaParedes.add(new Parede(0, 595, 600, 5, false,59,"h"));
        
        //Paredes falsas
        listaParedes.add(new Parede(415, 175, 60 , 10, true , 52, "h"));
        listaParedes.add(new Parede(175, 295, 60 , 10, true , 53, "h"));
        listaParedes.add(new Parede(55, 475, 60 , 10, true , 54, "h"));
        listaParedes.add(new Parede(535, 535, 55 , 10, true , 55, "h"));
        
        return listaParedes;
    }
    
    public static void main(String[] args) {
        Labirinto2 lab = new Labirinto2();
        lab.setVisible(true);
        lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
