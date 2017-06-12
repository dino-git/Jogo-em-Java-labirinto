package labirinto;

public class Moeda extends Colecionavel{
    
    public Moeda(int x, int y, Labirinto lab){
        super(x,y,lab);
        img = Labirinto.lerImagem("moeda.png");
    }
    public Moeda(int x, int y, Labirinto2 lab){
        super(x,y,lab);
        img = Labirinto.lerImagem("moeda.png");
    }
    
    
}
