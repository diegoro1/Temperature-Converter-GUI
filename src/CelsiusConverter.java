import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelsiusConverter implements ActionListener{
	JFrame CelsiusWindow = new JFrame();
	
	JLabel CelsiusLabel = new JLabel("Celcius");
	JTextField CelsiusText = new JTextField("");
	
	JLabel KelvinLabel = new JLabel("Kelvin");
	JTextField KelvinText = new JTextField("Result...");
	
	JLabel FahrenheitLabel = new JLabel("Fahrenheit");
	JTextField FahrenheitText = new JTextField("Result...");
	
	JButton ConvertButton = new JButton("Convert!!");
	
	GridLayout gl = new GridLayout();
	
	
	CelsiusConverter()
	{
		//this organizes the layout
		gl.setRows(4);
		gl.setColumns(2);
		
		ConvertButton.addActionListener(this);
		
		//adding labels and text
		CelsiusWindow.add(CelsiusLabel);
		CelsiusWindow.add(CelsiusText);
		CelsiusWindow.add(KelvinLabel);
		CelsiusWindow.add(KelvinText);
		CelsiusWindow.add(FahrenheitLabel);
		CelsiusWindow.add(FahrenheitText);
		CelsiusWindow.add(ConvertButton);
		
		//sets window size (same as StartMenu)
		CelsiusWindow.setLayout(gl);
		CelsiusWindow.setSize(400,300);
		CelsiusWindow.setLocation(400,200);
		CelsiusWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CelsiusWindow.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == ConvertButton)
		{
		double celsius = Double.parseDouble(CelsiusText.getText());
		double kelvin = celsius + 273.15;
		double fahrenheit = (celsius * 9.0/5.0) + 32.0;
		
		// presents results and formats double
		KelvinText.setText("" + new DecimalFormat("##.##").format(kelvin));
		FahrenheitText.setText("" + new DecimalFormat("##.##").format(fahrenheit));
		}
	}
}


