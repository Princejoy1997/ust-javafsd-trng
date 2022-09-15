package eventHandling;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener {

	TextField t;
	
	Event1(){
		t=new TextField();
		t.setBounds(50,100,50,100);
		Button b=new Button("Press");
		t.setBounds(100,100,100,100);
		b.addActionListener(this);
		add(b);
		add(t);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		t.setText("Say JAVA");
	}
	
	public static void main(String[] args) {
		
		new Event1();
		System.out.println("Action");
	}
}
