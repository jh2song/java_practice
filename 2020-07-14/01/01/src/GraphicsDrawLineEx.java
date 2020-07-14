import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200,150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
