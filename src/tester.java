import javax.swing.JFrame;

public class tester {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setSize(600,700);
		frame.setTitle("Hw 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		TetrisViewer terTetrisViewer = new TetrisViewer();
			frame.add(terTetrisViewer);
		
		frame.setVisible(true);

	}

}
