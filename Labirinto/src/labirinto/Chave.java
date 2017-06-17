package labirinto;

public class Chave  extends Colecionavel{
    
    public Chave(int x, int y, Labirinto lab){
        super(x,y,lab);
        img = Labirinto.lerImagem("chave.png");
    }
    
}
