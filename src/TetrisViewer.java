import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JComponent;
import java.awt.BasicStroke;


public class TetrisViewer extends JComponent{
	
	private static final long serialVersionUID = 1L;
	public int x = 10;
	public int y = 10;
	public int h = 20;
	public int s = 45;
	public int j = 50;
	public int u = -5;
	
	//this is for random location
	Random rand = new Random();
	int X1 = rand.nextInt(500);
	int y1 = rand.nextInt(500);
	
	//this is for the switch it selects number randomly from 1-7 
	//it is (7)+ 1 because when it calls 0 +1 = 1
	Random spRandom = new Random();
	int sp = spRandom.nextInt(7)+1;
	
	//this is for random rgb color
	// it is 256 because it needs to count 255
	Random rand1 = new Random();
	int r = rand1.nextInt(256);
	int g1 = rand1.nextInt(256);
	int b = rand1.nextInt(256);
	
	//Random rand2 = new Random();
	//int c1 = rand2.nextInt(256);
	//int g3 = rand2.nextInt(256);
	//int b2 = rand2.nextInt(256);
	
	public void paintComponent(Graphics g){	
		Graphics2D g2 = (Graphics2D)g;
		this.setLocation(X1, y1);
		
		// here we return the argument, after it select random number from 1-7
		switch (sp) {
		case 1:
			IShape(g, g2);
			break;
			
		case 2:
			JShape(g, g2);
			break;
			
		case 3:
			OShape(g, g2);
			break;
			
		case 4:
			ZShape(g, g2);
			break;
			
		case 5:
			LShape(g, g2);
			break;
		case 6:
			TShape(g, g2);
			break;
			
		case 7:
			SShape(g, g2);
			break;	
		
		default:
			
		}
		
	}

	
	private void IShape(Graphics g, Graphics2D g2) {
		
		//Ishape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x, y, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
	    //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
		//g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+s, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r3 = new Rectangle2D.Double(x, y+(2*s), x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
		//g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+(2*s), x+(2*h), y+(2*h));
		
		Rectangle2D.Double r4 = new Rectangle2D.Double(x, y+(3*s), x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
		//g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+(3*s), x+(2*h), y+(2*h));
	}
	
	private void JShape(Graphics g, Graphics2D g2) {
		
		//Jshape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x+j, y, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
		//g2.setColor(new Color(c1, g3, b2));
		g2.drawRect(x+j, y, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r2 = new Rectangle2D.Double(x+j, y+j, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(0, 0, 0));
		//g2.setColor(new Color(c1, g3, b2));
		g2.drawRect(x+j, y+j, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r3 = new Rectangle2D.Double(x+j, y+2*j, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+2*j, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r4 = new Rectangle2D.Double(x, y+(2*j), x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+(2*j), x+(2*h), y+(2*h));
	}
	
	
	private void OShape(Graphics g, Graphics2D g2) {
	
		//Oshape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x+j, y, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x+(2*j), y, x+(2*h), y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+(2*j), y, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r3 = new Rectangle2D.Double(x+j, y+j, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+j, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r4 = new Rectangle2D.Double(x+2*j, y+j, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+2*j, y+j, x+(2*h), y+(2*h));
	    
	}
	
	
	private void LShape(Graphics g, Graphics2D g2) {
		
		//Lshape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x, y, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+s, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r3 = new Rectangle2D.Double(x, y+(2*s), x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+(2*s), x+(2*h), y+(2*h));
		
		Rectangle2D.Double r4 = new Rectangle2D.Double(x+j, y+(2*s), x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+(2*s), x+(2*h), y+(2*h));
	}
	
	
	private void TShape(Graphics g, Graphics2D g2) {
		
		//Tshape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x+j, y, x+(2*h), y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x+(2*j), y, x+(2*h), y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+(2*j), y, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r3 = new Rectangle2D.Double(x+(3*j), y, x+(2*h), y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+(3*j), y, x+(2*h), y+(2*h));
		
		Rectangle2D.Double r4 = new Rectangle2D.Double(x+(2*j), y+j, x+(2*h), y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+(2*j), y+j, x+(2*h), y+(2*h));
	}
	
	
	private void SShape(Graphics g,Graphics2D g2) {
		
		//SShape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x+j, y+u, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+u, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+s, x+(2*h), y+(2*h));
	    
	    Rectangle2D.Double r3 = new Rectangle2D.Double(x+2*j, y+u, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+2*j, y+u, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r4 = new Rectangle2D.Double(x+j, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+s, x+(2*h), y+(2*h));
	}
	
	private void ZShape(Graphics g,Graphics2D g2) {
		
		//Zshape
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(x+j, y+u, x+(2*h) , y+(2*h));
		g.setColor(new Color(r, g1, b));
		g2.fill(r1);
		g2.draw(r1);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+u, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r2 = new Rectangle2D.Double(x, y+u, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r2);
		g2.draw(r2);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x, y+u, x+(2*h), y+(2*h));
	    
	    Rectangle2D.Double r3 = new Rectangle2D.Double(x+2*j, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r3);
		g2.draw(r3);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+2*j, y+s, x+(2*h), y+(2*h));
		
	    Rectangle2D.Double r4 = new Rectangle2D.Double(x+j, y+s, x+(2*h) , y+(2*h));
	    g.setColor(new Color(r, g1, b));
		g2.fill(r4);
		g2.draw(r4);
		g2.setStroke(new BasicStroke(3));
	    g2.setColor(new Color(0, 0, 0));
	  //g2.setColor(new Color(c1, g3, b2));
	    g2.drawRect(x+j, y+s, x+(2*h), y+(2*h));
	}
}