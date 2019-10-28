import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FahrenheitConverter implements ActionListener{
	JFrame FahrenheitWindow = new JFrame();
	
	JLabel FahrenheitLabel = new JLabel("Fahrenheit");
	JTextField FahrenheitText = new JTextField("");
	
	JLabel KelvinLabel = new JLabel("Kelvin");
	JTextField KelvinText = new JTextField("Result...");
	
	JLabel CelsiusLabel = new JLabel("Celsius");
	JTextField CelsiusText = new JTextField("Result...");
	
	JButton ConvertButton = new JButton("Convert!!");
	
	GridLayout gl = new GridLayout();
	
	
	FahrenheitConverter()
	{
		//this organizes the layout
		gl.setRows(4);
		gl.setColumns(2);
		
		ConvertButton.addActionListener(this);
		
		//adding labels and text
		FahrenheitWindow.add(FahrenheitLabel);
		FahrenheitWindow.add(FahrenheitText);
		FahrenheitWindow.add(KelvinLabel);
		FahrenheitWindow.add(KelvinText);
		FahrenheitWindow.add(CelsiusLabel);
		FahrenheitWindow.add(CelsiusText);
		FahrenheitWindow.add(ConvertButton);
		
		//sets window size (same as StartMenu)
		FahrenheitWindow.setLayout(gl);
		FahrenheitWindow.setSize(400,300);
		FahrenheitWindow.setLocation(400,200);
		FahrenheitWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FahrenheitWindow.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == ConvertButton)
		{
		double fahrenheit = Double.parseDouble(FahrenheitText.getText());
		double kelvin = (fahrenheit - 32.0) * 5.0/9.0 + 273.15;
		double celsius = (fahrenheit - 32.0) * 5.0/9.0;
		
		// presents results and formats double
		KelvinText.setText("" + new DecimalFormat("##.##").format(kelvin));
		CelsiusText.setText("" + new DecimalFormat("##.##").format(celsius));
		}
	}
}


