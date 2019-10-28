import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartMenu implements ActionListener {
	
	JFrame StartWindow = new JFrame("Temperature Converter!");
	
	JButton KelvinButton = new JButton("Kelvin");
	JButton CelsiusButton = new JButton("Celsius");
	JButton FahrenheitButton = new JButton("Fahrenheit"); 
	
	GridLayout gl = new GridLayout();
	
	StartMenu()
	{
		gl.setRows(1);
		gl.setColumns(3);
		
		//enabling buttons
		KelvinButton.addActionListener(this);
		CelsiusButton.addActionListener(this);
		FahrenheitButton.addActionListener(this);
		
		//setting buttons to be added to window
		StartWindow.add(CelsiusButton);
		StartWindow.add(FahrenheitButton);
		StartWindow.add(KelvinButton);
		
		//setting start window dim and visibility 
		StartWindow.setLayout(gl);
		StartWindow.setSize(500,200);
		StartWindow.setLocation(400,200);
		StartWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes when terminated
		StartWindow.setVisible(true);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == KelvinButton)
			new KelvinConverter();
		else if(e.getSource() == FahrenheitButton)
			new FahrenheitConverter();
		else if(e.getSource() == CelsiusButton)
			new CelsiusConverter();
	}
	
}
