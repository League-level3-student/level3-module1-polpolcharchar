package _07_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather implements ActionListener {
    
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	
	
	
	
	
    void start() {
    	
    	frame = new JFrame();
    	panel = new JPanel();
    	button1 = new JButton("Search by City");
    	button2 = new JButton("Search by Weather");
    	button3 = new JButton("Search by Temperature");
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);
    	
    	
    	
    	
    	
    	frame.add(panel);
    	panel.add(button1);
    	panel.add(button2);
    	panel.add(button3);
    	
    	frame.pack();
    	frame.setVisible(true);
    	
    	
    	
    	
    	
    	
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( "National City" );
        WeatherData datum = weatherData.get(cityName);
        
//        if( datum == null ) {
//            System.out.println("Unable to find weather data for: " + cityName);
//        } else {
//            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
//        }
    }





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
        String cityName;
        WeatherData datum;
        
		
		
		
		
		if(e.getSource().equals(button1)) {
			//search by city
			cityName = JOptionPane.showInputDialog("Enter a City: ");
			datum = weatherData.get(cityName);
			System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
		}else if(e.getSource().equals(button2)) {
			//search by weather
			String weatherInput = JOptionPane.showInputDialog("Enter a Weather: ");
			for(String i : weatherData.keySet()) {
				if(weatherData.get(i).weatherSummary.equals(weatherInput)) {
					System.out.print(i + ", ");
				}
			}
			System.out.println();
		}else if(e.getSource().equals(button3)) {
			//search by temperature
			double lowerInput = Double.parseDouble(JOptionPane.showInputDialog("Enter a Lower Temperature Range: "));
			double upperInput = Double.parseDouble(JOptionPane.showInputDialog("Enter a Upper Temperature Range: "));
			for(String i : weatherData.keySet()) {
				if(weatherData.get(i).temperatureF >= lowerInput && weatherData.get(i).temperatureF <= upperInput) {
					System.out.print(i + ", ");
				}
			}
			System.out.println();
		}
		
	}
}
