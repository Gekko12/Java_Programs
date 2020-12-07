//Creating program for checkox using AWT module

import java.awt.*;

public class CheckBoxEx{
    CheckBoxEx(){
	Frame f = new Frame("CheckBox Example ");
	Checkbox checkbox1 = new Checkbox("C++");
	checkbox1.setBounds(100, 100 ,50 ,50);

	Checkbox checkbox2 = new Checkbox("Java" ,true);
	checkbox2.setBounds(100, 150,50 ,50);

	Panel panel = new Panel();
	panel.resize(400 ,50);
	panel.setBackground(Color.yellow);

	f.add(checkbox1);
	f.add(checkbox2);
	f.add(panel);
	
	f.setBackground(Color.pink);
	f.setSize(400 ,400);
	f.setLayout(null);
	f.setVisible(true);


    }

    public static void main(String args[]){
	new CheckBoxEx();
    }
}
