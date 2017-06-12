package labirinto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 * An animation sprite that displays frames taken from a rectangular grid.
 */
public class SpriteSheet extends Component {
    private Image sheet;
    private int coluna = 0;
    private int linha = 0;
    public Dimension spriteSize;
    public int nColunas;

    /**
     * Constructs a new SpriteSheet from a sprite sheet image
     * @param sheet A sprite sheet image containing a grid of frames
     * @param spriteSize The grid size for frames 
     */
    public SpriteSheet(Image sheet, Dimension spriteSize) {
        this.sheet = sheet;
        this.spriteSize = spriteSize;
        nColunas = sheet.getWidth(this) / spriteSize.width;
    }

    /**
     * Gets the preferred size of the sprite--the original frame size.
     * @return A dimension object indicating the source frame size
     */
    @Override
    public Dimension getPreferredSize() {
        return spriteSize;
    }

    /**
     * Paints the sprite by stretching the current frame to the current size.
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Dimension size = getSize();
        g.drawImage(sheet,
                0, 0, size.width, size.height, // destination
                coluna * spriteSize.width, linha * spriteSize.height, // source
                (coluna + 1) * spriteSize.width, (linha + 1) * spriteSize.height,
                this);
    }

    public void cima() {
        linha = 3;
    }
    
    public void baixo() {
        linha = 0;
    }
    
    public void esquerda() {
        linha = 1;
    }
    
    public void direita() {
        linha = 2;
    }
    
    public void parar() {
        coluna = 0;
    }
    
    /**
     * The changes the displayed frame.
     * @param frame The desired zero-based left-to-right top-to-bottom frame
     */
    public void update() {
        coluna++;
        if(coluna >= nColunas) coluna = 0;
    }
}