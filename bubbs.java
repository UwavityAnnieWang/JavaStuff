import java.awt.Rectangle;
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
/**class Bubbs
 * 
 * @author Annie Wang 
 *Class for drawing bubble 
 */
public class bubbs {
	Color pink = Color.PINK;
	Color white = Color.WHITE;
	private int x, y, width, length;
	public bubbs() {
		x=0;
		y=0;
		width=0;
		length=0;
	}
	public bubbs(int one, int two, int three, int four) {
		x=one;
		y=two;
		width=three;
		length=four;
	}
	public void paint(Graphics g) {
		g.setColor(pink);
		g.fillOval(x, y, width, length);
		g.setColor(white);
		g.drawOval(x, y, width, length);
		g.fillOval(x+40, y+30, 10, 20);
		g.fillOval(x+60, y+30, 10, 20);
		
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length; 
	}
	public void setX(int one) {
		x=one;
	}
	public void setY(int two) {
		y=two;
	}
	public void setWidth(int boi) {
		width= boi;
	}
	public void setLength(int girthy) {
		length = girthy;
	}
	public void setBonds(int one, int two, int three, int four) {
		x=one;
		y=two;
		width=three;
		length=four;
	}
	
}
