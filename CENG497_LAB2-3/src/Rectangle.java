
public class Rectangle {
private int x; // x coordinate of left-bottom corner private 
private int y; // y coordinate of left-bottom corner private
private int width;
private int height;

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public void setHeight(int height) {
	this.height = height;
}

//returns height of the rectangle
public int getHeight() {
		
	return this.height;
}



// constructs a rectangle with given parameters 
public Rectangle(int x, int y, int width, int height) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;

}

// constructs a rectangle which has left-bottom corner on the origin (0,0) with given width and height
public Rectangle(int width, int height) 
{ 
	this.x=0;
	this.y=0;
	this.width=width;
	this.height=height;
	
}

	

	
	

// changes the width, height and coordinates of the rectangle according to passed values
	
	public void reshape(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		
 }
  
// changes the width and height of the rectangle according to passed values 
	public void resize(int width, int height) {
		this.height=height;
		this.width=width;
	
	}
	
// changes the coordinates of the rectangle according to passed values 
	public void setLocation(int px, int py) {
		this.x=px;
		this.y=py;
		
	}
// prints the coordinates of the left-bottom corner's coordinates (x,y)
	public void printLocation() {
		System.out.println("Prints the coordinates of the left-bottom corner's coordinates (x,y):\n");
System.out.println("("+this.x+","+this.y+")"+"\n");

	}
	
// prints the coordinates of every corner
	
	public void printCoordinates() {
		System.out.println("the coordinates of the left-bottom:("+this.x+","+this.y+")"+"\n");
		System.out.println("the coordinates of the left-top:("+this.x+","+(this.y+this.height)+")"+"\n");
		System.out.println("the coordinates of the right-bottom:("+(this.x+this.width)+","+(this.y)+")"+"\n");
		System.out.println("the coordinates of the right-top:("+(this.x+this.width)+","+(this.y+this.height)+")"+"\n");
		
		System.out.println();
		
	}
// translates the rectangle and changes the coordinates according to passed values
	public void translate(int dx, int dy) {
		this.x=dx;
		this.y=dy;
		System.out.println("After translating the rectangle:\n");
		System.out.println("------------------------------>"+"  x:"+this.getX()+"  y:"+this.getY()+"  width:"+this.getWidth()+"  height:"+this.getHeight()+"\n");
		this.printCoordinates();
		
	}
// rotates the rectangle 90 degrees clockwise around its left-bottom corner 
	public void rotateClockwise() {
		
		int a=this.x, b=this.y;
		this.x=(-1)*(b);
		this.y=a;
		System.out.println("\nAfter rotatating the rectangle 90 degrees clockwise around its left-bottom corner:\n ");
		this.printCoordinates();
		System.out.println();

	}
// rotates the rectangle 90 degrees counter-clockwise around its left-bottom corner
	public void rotateCounterClockwise() {
		this.x=(this.y);
		this.y=(-1)*this.x;
		System.out.println("\nAfter rotatating the rectangle 90 degrees counter-clockwise around its left-bottom corner:\n ");
		this.printCoordinates();
		System.out.println();


	}
	
	
	
	
// returns true if a given point is inside or on the rectangular area else returns false
	public boolean contains(int x, int y) {
		System.out.println("Checking containing of (x,y): "+x+","+y+"\n");
		
		if (x >= this.x && x <= (this.x+this.width) &&  y >=this.y && y <= (this.y+this.height)) 
				{
			return true; 
				}

		else {
			return false; 
		}
				
		
		
	}
	
	
// contains your function calls
public static void main(String args[]) {
	
System.out.println("TESTING RESULTS:\n");
	

Rectangle r0=new Rectangle(3,4);
System.out.println("Rectangle r0--->"+"  x:"+r0.getX()+"  y:"+r0.getY()+"  width:"+r0.getWidth()+"  height:"+r0.getHeight()+"\n");

r0.printCoordinates();
r0.printLocation();
System.out.println("---------------------------------------------------------------");
	
Rectangle r1=new Rectangle(1,2,3,5);
System.out.println("Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");

r1.printCoordinates();
r1.printLocation();
System.out.println("---------------------------------------------------------------");

System.out.println("After reshaping of Rectangle r1:\n");
r1.reshape(0, 0, 2, 3);
System.out.println("After reshaping of Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");
r1.printCoordinates();
r1.printLocation();
System.out.println("---------------------------------------------------------------");

System.out.println("After resizing of Rectangle r1:\n");
r1.resize(9, 8);
System.out.println("After resizing of Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");
r1.printCoordinates();
r1.printLocation();
System.out.println("---------------------------------------------------------------");


r1.translate(3, 4);
System.out.println("---------------------------------------------------------------");


r1.reshape(0, 1, 1, 2);
System.out.println("Before rotating of Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");
r1.rotateClockwise();
r1.printLocation();
System.out.println("---------------------------------------------------------------");

System.out.println("Before checking given points of Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");
r1.contains(0, 0);
System.out.println("After contains function result: "+r1.contains(0, 0));
System.out.println("---------------------------------------------------------------");


r1.reshape(0, 1, 1, 2);
System.out.println("Before rotating of Rectangle r1--->"+"  x:"+r1.getX()+"  y:"+r1.getY()+"  width:"+r1.getWidth()+"  height:"+r1.getHeight()+"\n");
r1.rotateCounterClockwise();
r1.printLocation();
System.out.println("---------------------------------------------------------------");



}





}