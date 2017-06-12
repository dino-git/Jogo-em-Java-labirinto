package labirinto;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;

public class Boneco {
    int x, y;
    boolean movimento;
    Labirinto labirinto;
    Labirinto2 labirinto2;
    SpriteSheet sprite;
    Image imgBoneco;
    
    public Boneco(Labirinto lab) {
        movimento = false;
        labirinto = lab;
        imgBoneco = Labirinto.lerImagem("boneco.png");
        sprite = new SpriteSheet(imgBoneco, new Dimension(19,37));
        labirinto.p.add(sprite);
        x = 16;
        y = 6;
    }
    
    public Boneco(Labirinto2 lab) {
        movimento = false;
        labirinto2 = lab;
        imgBoneco = Labirinto.lerImagem("boneco.png");
        sprite = new SpriteSheet(imgBoneco, new Dimension(19,37));
        labirinto2.p.add(sprite);
        x = 16;
        y = 6;
    }
    
    public void esquerda() {
        movimento = true;
        x -= 15;
        if(x<0)x =0;
        if (EmColisão()) x+=15;
        sprite.esquerda();
    }
    
    public void direita() {
        movimento = true;
        x +=15;
        if(x>labirinto.p.getWidth()- sprite.getWidth())x=labirinto.p.getWidth()- sprite.getWidth();
        if (EmColisão()) x-=15;
        sprite.direita();
    }
    
    public void cima() {
        movimento = true;
        y -= 15;
        if(y<0)y=0;
        if (EmColisão()) y+=15;
        sprite.cima();
    }
    
    public void baixo() {
        movimento = true;
        y += 15;
        if(y>labirinto.p.getHeight() - sprite.getHeight())y=labirinto.p.getHeight() - sprite.getHeight();
        if (EmColisão()) y-=15;
        sprite.baixo();
    }
    
    public Rectangle getRectangle() {
        Rectangle r = new Rectangle(x,y,sprite.spriteSize.width,sprite.spriteSize.height);
        return r;
    }
    
    public boolean EmColisão() {
        Rectangle rBoneco = getRectangle();
        for(Parede p: labirinto.listaParedes)
            if(rBoneco.intersects(p))
                return true;
        return false;
    }
    
    public void parar() {
        movimento = false;
        sprite.parar();
    }
    
    public void update() {
        sprite.setLocation(x, y);
        if(!movimento) return;
        sprite.update();
    }
}
