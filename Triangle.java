/**Set 1 
 * Triangle class 
 * @author Annie Wang 
 *Class Triangle, user creates Triangle, instance variables for all three sides and methods for
 *checking if the triangle created can be a valid triangle, an acute triangle, an obtuse triangle,
 *a right triangle, a scalene triangle, an equilateral triangle, or an isosceles triangle. 
 */

public class Triangle {

//the method that checks to see if the values can be used to construct a valid triangle 
public static final boolean areTriangular(double one, double two, double three) {
	if(one+two>three||one+three>two||two+three>one)
		return true;
	else;
	return false;
		
	
	
}//the method that checks if the values of the triangle make it an acute triangle
public static final boolean acuteTriangle(double one, double two, double three) {
	if(one*one+two*two>three*three||one*one+three*three>two*two||two*two+three*three>one*one)
		return true;
	else;
	return false;
}//the method that checks if the value of the triangle make it an obtuse triangle
public static final boolean obtuseTriangle(double one, double two, double three) {
	if(one*one+two*two<three*three||two*two+three*three<one*one||one*one+three*three<two*two)
		return true;
	else;
	return false;
}//the method that checks if the values of the triangle make it a right triangle
public static final boolean rightTriangle(double one, double two, double three) {
	if(one*one+two*two==three*three||one*one+three*three==two*two||two*two+three*three==one*one)
		return true;
	else;
	return false;
	
}//the method that checks if the values of the triangle make it a scalene triangle
public static final boolean scaleneTriangle(double one, double two, double three) {
	if(one!=two&&two!=three&&one!=three)
		return true;
	else;
	return false;
}//the method that checks if the values of the triangle make it an isosceles triangle
public static final boolean isoscelesTriangle(double one, double two, double three) {
	if(one==two&&two!=three||one==three&&three!=two||two==three&&three!=two)
		return true;
	else;
	return false;
}//the method that checks if the values of the triangle make it an equilateral triangle 
public static final boolean equilateralTriangle(double one, double two, double three) {
	if(one==two&&two==three)
		return true;
	else;
	return false;
}

}
