import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KelvinConverter implements ActionListener{
	JFrame KelvinWindow = new JFrame();
	
	JLabel KelvinLabel = new JLabel("Kelvin");
	JTextField KelvinText = new JTextField("");
	
	JLabel CelsiusLabel = new JLabel("Celsius");
	JTextField CelsiusText = new JTextField("Result...");
	
	JLabel FahrenheitLabel = new JLabel("Fahrenheit");
	JTextField FahrenheitText = new JTextField("Result...");
	
	JButton ConvertButton = new JButton("Convert!!");
	
	GridLayout gl = new GridLayout();
	
	
	KelvinConverter()
	{
		//this organizes the layout
		gl.setRows(4);
		gl.setColumns(2);
		
		ConvertButton.addActionListener(this);
		
		//adding labels and text
		KelvinWindow.add(KelvinLabel);
		KelvinWindow.add(KelvinText);
		KelvinWindow.add(CelsiusLabel);
		KelvinWindow.add(CelsiusText);
		KelvinWindow.add(FahrenheitLabel);
		KelvinWindow.add(FahrenheitText);
		KelvinWindow.add(ConvertButton);
		
		//sets window size (same as StartMenu)
		KelvinWindow.setLayout(gl);
		KelvinWindow.setSize(400,300);
		KelvinWindow.setLocation(400,200);
		KelvinWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KelvinWindow.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == ConvertButton)
		{
		double kelvin = Double.parseDouble(KelvinText.getText());
		double celsius = kelvin - 273.15;
		double fahrenheit = (kelvin - 273.15) * 9.0/5.0 + 32.0;
		
		// presents results and formats double
		CelsiusText.setText("" + new DecimalFormat("##.##").format(celsius));
		FahrenheitText.setText("" + new DecimalFormat("##.##").format(fahrenheit));
		}
	}
}


