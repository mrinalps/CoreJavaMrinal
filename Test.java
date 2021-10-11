package point;

public class Coordinates {
int xcord, ycord;
public Coordinates(int x, int y)
{
	xcord=x;
	ycord=y;
}
public String getDetails() {
	return "Point("+xcord+","+ycord")";
}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coordinates c1=new Coordinates (10,20);
c1.getDetails();
	}

}
