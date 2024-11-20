import java.awt.*;

public class BorderLayout1 extends Frame{
	//Border Layout
	
	private Button b1,b2,b3,b4,b5;
	
	public BorderLayout1() {
		
		setLayout(new BorderLayout());
		
		b1 = new Button("Nord");
		b2 = new Button("Est");
		b3 = new Button("Sud");
		b4 = new Button("Ouest");
		b5 = new Button("Centre");
		
		this.add(b1 , BorderLayout.NORTH);
		this.add(b2 , BorderLayout.EAST);
		this.add(b3 , BorderLayout.SOUTH);
		this.add(b4 , BorderLayout.WEST);
		this.add(b5 , BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayout1 essai = new BorderLayout1();
		essai.pack();
		essai.setVisible(true);
	}

}
