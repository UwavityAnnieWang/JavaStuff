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
/** Class Mee
 * 
 * @author Annie Wang
 * draw mines
 *
 */

public class Mee {
	//Uses brick class from online as basis for making this 
private Color gray = new Color(211,211,211);
private int x, y, width, length;
public Mee() {
	x=0;
	y=0;
	width=0;
	length=0;
}
public Mee(int one, int two, int three, int four) {
	x=one;
	y=two;
	width=three;
	length=four;
}
public void paint(Graphics g) {
	g.setColor(gray);
	g.fillOval(x, y, width,length);
}
public int getX() {
	return x;
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
public void setX(int hello) {
	x=hello;
}
public void setY(int goodbye) {
	y=goodbye;
}
public void setWidth(int wide) {
	width = wide;
}
public void setLength(int boi) {
	length=boi;
}
public void setBonds(int one, int two, int three, int four) {
	x=one;
	y=two;
	width=three;
	length=four;
}

}
