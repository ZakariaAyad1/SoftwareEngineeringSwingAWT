import java.awt.*;

public class GridLayout1 extends Frame{
	

		public GridLayout1() {
			
			super("Appli Grid Layout");
			
			this.setLayout(new GridLayout(3,2));
			
			for (int i=1 ; i<7 ; i++) {
				add(new Button(Integer.toString(i)));
			}
			
			this.pack();
			
			this.show();
		}
	
	
	public static void main(String args[]) {
		GridLayout1 appli = new GridLayout1();
	}

	

}
