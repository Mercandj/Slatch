import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Write a description of class Tutoriel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Tutoriel extends JPanel implements MouseListener
{
      
    protected int aEtape;
    protected String aProvenance;
    
    /**
     * Constructor for objects of class Tutoriel
     */
    public Tutoriel(final String provenance)
    {
       aEtape = 1;
       this.addMouseListener(this);
       aProvenance = provenance;
    }
    
    protected void afficheImageRedim (final String pURL, final int pPosHautGaucheX, final int pPosHautGaucheY,final int pPosBasDroiteX, final int pPosBasDroiteY, final Graphics g) {  
        Image img = Slatch.aImages.get(pURL);
        g.drawImage(img, pPosHautGaucheX, pPosHautGaucheY, pPosBasDroiteX-pPosHautGaucheX, pPosBasDroiteY-pPosHautGaucheY, Slatch.ihm.getPanel());
    }
    
    @Override
    public void paintComponent(final Graphics g){
        deroulement(g);
    }
    
    abstract public void deroulement(final Graphics g) ; 
    
    @Override
	public void mouseClicked(MouseEvent e) {
	     aEtape++;   
	     repaint();
    }

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
}
