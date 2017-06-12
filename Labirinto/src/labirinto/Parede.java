package labirinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Parede extends Rectangle {
    
    Color cor;
    boolean invisible = false;
    int numParede;
    String orientacao;
    
    public Parede(int x, int y, int larg, int alt, boolean invisible, int num, String hOuV){
        this.x = x;
        this.y = y;
        this.width = larg;
        this.height = alt;
        this.cor = Color.WHITE;
        this.invisible = invisible;
        numParede = num;
        orientacao = hOuV;
    }
    
    public void desenha(Graphics g) {
        if (!invisible){
            g.setColor(cor);
            g.fillRect(x, y, width, height);
        }
    }
    
    public void setInvisible(boolean b){
        invisible = b;
    }
    
    public boolean isInvisible(){
        return invisible;
    }
    
    public int getNumero(){
        return numParede;
    }
    
    public Rectangle getRetangulo() throws Exception {
        Rectangle r;
        if(orientacao.equals("v")){
            r = new Rectangle(x -25, y, width +50, height);
        }else if(orientacao.equals("h")) {
            r = new Rectangle(x, y -25, width, height +50);
        } else {
            throw new Exception("a vairael ''orientação deve conter o valor ''h'' para horizontal ou ''v'' para vertical");
        }
        return r;
    }
    
}
