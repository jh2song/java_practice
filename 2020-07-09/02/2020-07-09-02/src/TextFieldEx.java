import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�   "));
		c.add(new JTextField(20));
		c.add(new JLabel("�а�   "));
		c.add(new JTextField("��ǻ�Ͱ��а�", 20));
		c.add(new JLabel("�ּ�   "));
		c.add(new JTextField("����� ...", 20));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
