package Tests;
import windows.BasicWindows;
import windows.ExtendedWindows;
public class TestBasicWindows {

	public static void main(String[] args) {
		
		BasicWindows bw1 = new BasicWindows();
		BasicWindows bw2 = new BasicWindows(800, 540, 500, 500);
		
		bw1.display();
		bw2.display();
		
		bw1.resize(200, 300);
		bw2.resize(-600, -700);
		
		bw1.display();
		bw2.display();
		
		ExtendedWindows ew1 = new ExtendedWindows();
		
		ew1.display();
		ew1.resize(200,300);
		ew1.move(600, 540);
		ew1.display();
	}

}
