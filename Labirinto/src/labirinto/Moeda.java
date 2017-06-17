package labirinto;

public class Moeda extends Colecionavel{
    
    public Moeda(int x, int y, Labirinto lab){
        super(x,y,lab);
        img = Labirinto.lerImagem("moeda.png");
    }
    
    
}
