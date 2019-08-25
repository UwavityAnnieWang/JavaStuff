// Graphics Panel
// Written by: Mr. Swope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.



/**Graphics Panel
 * Set 1
 * Modified by Annie Wang 
 * Most of the graphics aspect is repurposed code used previously on the graphics project
 * This has a similar concept to the previous graphic project
 * You have to move a bubble through a maze of mines or spikes or something
 * If you hit one you lose and have to start all over again
 * probably only are going to be three levels 
 * UPDATE:
 * Mostly cannot work
 * the purpose of this project was for the pink bubble to be able to detect collision with the gray mines
 * However, that did not work 
 */
//importing classes needed for project to "work"
import java.awt.BasicStroke;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.lang.Math;
import java.util.concurrent.*;
import javax.swing.Timer;
import java.awt.Rectangle;
public class GraphicsPanel extends JPanel implements KeyListener{
	//used stack overflow examples as help 
	//declare instance variables 
	private int x;
	private int y;
	private Timer t;
	//making a new bubble
	bubbs yee = new bubbs(60,400,90,90);
	//making one mine 
	Mee haw = new Mee(0,0,50,50);
	//All arrays
	//Array for mines 
	Mee[]ree = new Mee[16];
	//Arrays for mine values 
	private int[]mineX = new int[16];
	private int[]mineY = new int[16];
	private int[]mineWidth = new int[16];
	private int[]mineLength = new int[16];
	//Tried to use this to end the game 
	private boolean depression;	
	//Thread 
	Thread gee;
	/**private Rectangle summ;
	private Rectangle uhhh;
	Rectangle[]bruh = new Rectangle[16];
	int so = 0;**/


	
	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	public GraphicsPanel(){
		//default 
		x = 0;
		y = 0;
		
		setPreferredSize(new Dimension(500, 500));
        this.setFocusable(true);			// for keylistener
		this.addKeyListener(this);
		t = new Timer(25, new ClockListener(this)); 
		//timer I believe 
        t.start();
        
		
	}//old unused clock method 
	public void clock(){
		
	}//thread 
	public void start() {
		if(gee==null) {
			gee=new Thread();
			gee.start();
		}
	}//tries to implement check collide 
	public void ded() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(depression!=true) {
		checkCollide();
		repaint();
		try {
			Thread.sleep(30);
			//wait for 30 milliseconds I believe 
		}catch (InterruptedException ex) {
			
		}
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
		
	}
	//(down here is code I commented out so that i could use it as reference...mostly trash, just for
	//reference for dimensions of bubble 
	
	//class for drawing the picture
	/**public void myDraw(int x1, int y1, Graphics2D g2) {
	
		
		//Draws clouds 
		//Ok so here is how this go
		//I will need to implement a collision detector for this
		//basically theres a bunch of mines that this character has to make its way through and if it 
		//interacts with a mine then you fail and die 
		//Need:
		//if statement for collision with minefield and switching to a repaint with you die 
		//or if you click points (nvm)
		//I will need to explain the objective of the game
		//Basically you are controlling a bubble and if you touch one of the landminds or something you die
		//You gotta navigate a safe path 
		//will need to use timer, if bubble stays on landmine too long then it dies (sadly)
		//needs collison, also four sides (which way will it go?) 
		
		//Draws bubble 
		g2.setColor(Color.PINK);
	     g2.fillOval(x+60,y+400,90,90);//y=400 x=60
		
		
		//g2.fillRect(x+160,y+85, 30,40);
		g2.setColor(Color.WHITE);
		g2.drawOval(x+60, y+400, 90, 90);
		
		
		
		g2.fillOval(x+100, y+430, 10, 20);//difference between 170 and 130 is 40  diff between 90 and 120 is 
		g2.fillOval(x+120, y+430, 10, 20);//difference between 190 and 130 is 60  30
		
	}**/
		
	
	/**public void LandMine(int x1, int y1, Graphics2D g2) {
		
		g2.setColor(new Color(211, 211, 211));
		
		g2.fillOval(x1, y1, 50, 50);
		//mine = new Rectangle(x1, y1, 50, 50);
		
		
	}
	//use pop up window and restart game 
	
		/** method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void**/
	//implementing the bubbs and mee class to draw mines and bubble 
	//Also uses ground method 
	public void paintComponent(Graphics g){
		
		
		
		
		Ground(0,0,g);
		Minecraft(g);
		buub(g);
		}//ground method
	public void Ground(int x1, int y1, Graphics g) {
		g.setColor(new Color(157, 235, 135));
		g.fillRect(0, 0, 500, 500);
		
		
	}
	
	
	//Nothing in this works like why 
	//method implementing mine
	//uses for loop to attempt to draw mine multiple times
	//Not working as planned, orignally it would be a grid of gray circles
	//Instead it is a single line of gray circles 
	public void Minecraft(Graphics g) {
		//mine array index 
		int mineArr =0;
		//values for mines, x, y
		int one = 0, two =0;
		//width and length 
		int three = 50, four = 50;
		//for loop trying to draw grid of circles 
		for(int i = 0; i<500; i+=150) {
			
			
			for (int j = 0; j<500; j+=150) {
				//borrowed from a brick class someone used for an outbreak program 
				//Makes arrays for every value of the mines 
				ree[mineArr] = new Mee();
				ree[mineArr].setBonds(one, two, three, four);
				mineX[mineArr] = ree[mineArr].getX();
				mineY[mineArr] = ree[mineArr].getY();
				mineWidth[mineArr] = ree[mineArr].getWidth();
				mineLength[mineArr] = ree[mineArr].getLength();
				ree[mineArr].paint(g);
				mineArr++;
				one+=150;
				
				
				
				}
			
			
			}
				
	}
	
//method implements bubbs class to draw bubble 	
public void buub(Graphics g) {
		
		yee.paint(g);
	}
			
		
		
		
		
			
		
		
		
	
		
	
	
	
//Keylistener methods 
	@Override
	public void keyTyped(KeyEvent e) {
		//Todo
		
		
	
	//commented out jOptionPane, copied and pasted down below in check collision 				
/**JOptionPane.showMessageDialog(this,  "You died, gotta restart the game ", "RIP", JOptionPane.YES_NO_CANCEL_OPTION);
					System.exit(ABORT);}**/
	
		
		
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()){
		// move right
		
		case (KeyEvent.VK_RIGHT):
			x+=10;
		yee.setX(x+10);
		this.repaint();
	
		
		break;
		//Go left 
		case(KeyEvent.VK_LEFT):
		x=x-10;
		
		yee.setX(x-10);
			this.repaint();
			break;
			//Go down 
		case(KeyEvent.VK_DOWN):
			y=y+10;
		yee.setY(y+10);
		this.repaint();
		break;
		//Go up 
		case(KeyEvent.VK_UP):
			y=y-10;
		yee.setY(y-10);
		this.repaint();
		break;
		//forward dash
		case(KeyEvent.VK_B):
			x+=100;
		this.repaint();
		break;
		//Backwards dash (if needed) 
		case(KeyEvent.VK_S):
			x-=100;
		this.repaint();
		break;
		
		
		// add other keys
	   }
		
		System.out.println("Key Pressed " + x + " " + y);
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released ");
		
	}
	//check collision method, doesn't work for some reason 
		public void checkCollide() {
			//makes rectangles to detect collision with the intersects method, however does not work 
		Rectangle meme = new Rectangle(yee.getX(), yee.getY(), yee.getWidth(),yee.getLength());
		for(int i=0; i<500; i+=150) {
		int one, two, three,four;
		one=mineX[i];
		two=mineY[i];
		three=mineWidth[i];
		four = mineLength[i];
		Rectangle mine = new Rectangle(one, two, three, four);
		if(meme.intersects(mine)) {
			depression = true;
			JOptionPane.showMessageDialog(this,  "You died, gotta restart the game ", "RIP", JOptionPane.YES_NO_CANCEL_OPTION);
			System.exit(ABORT);
		}
		}
		
		
		
		
	}	
}
