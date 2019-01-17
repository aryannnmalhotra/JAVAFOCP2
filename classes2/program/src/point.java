class Point{
	static double x;
	static double y;
	
	Point()
{
	  x = 0.0;
	  y = 0.0;

}

Point(double x){
	this.x = x;
}
Point(double x, double y){this.x = x;
this.y = y;}

static double getX(){
	return x;
}
static double getY(){
	return y;
}
static void setX(double x){
	this.x = x;
}
static void setY(double y){
	this.y = y;
}
static Point distance(Point p1){
	Point p2 = new Point();
		p2.x = p1.x = this.x;
		p2.y = p1.y = this.y;
		return p2;
}