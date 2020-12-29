package fitbit;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.RefineryUtilities;
public class Fitbit extends ApplicationFrame
{

	public Fitbit( String applicationTitle , String chartTitle ) {
		super( applicationTitle );        
		JFreeChart lineChart = ChartFactory.createLineChart(
				chartTitle,           
				"Factors",            
				"Intensity",            
				createDataset(),          
				PlotOrientation.VERTICAL,           
				true, true, false);

		ChartPanel chartPanel = new ChartPanel( lineChart );        
		chartPanel.setPreferredSize(new java.awt.Dimension( 600 , 400 ) );        
		setContentPane( chartPanel ); 
	}
	private CategoryDataset createDataset( ) {
		final String health = "FACTORS";        

		final String alcohol = "Alcohol Intake";        
		final String water = "Water Intake";        
		final String workout = "Workout";
		final String nicotine = "Nicotine Intake";
		final String diet = "Diet";
		final String walking = "Walking";
		final DefaultCategoryDataset dataset = 
				new DefaultCategoryDataset( );  
		

		dataset.addValue( Fitbit.nicotine_intake , health , nicotine);        
		dataset.addValue( Fitbit.water_intake , health , water );        
		dataset.addValue( Fitbit.walking , health , walking ); 
		dataset.addValue( Fitbit.diet , health , diet ); 
		dataset.addValue( Fitbit.workout , health , workout );
		dataset.addValue( Fitbit.alcohol_intake , health , alcohol );
		



		return dataset; 
	}
	public static int age = 0,alcohol_intake = 0, workout = 0, nicotine_intake = 0, diet = 0, walking = 0, water_intake = 0;
	public static void main(String[] args)
	{
		

		double health_index, water_intake1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age :");
		age = sc.nextInt();


		if(age < 13 || age > 75)
		{
			System.err.println("Enter the age between 10 to 80.");
			System.exit(0);
		}
		else
		{
			System.err.println("Enter the values between 0-5.\n");
			System.out.println("0-low, 5- high.");

			System.out.print("Intensity of water intake (in glasses upto 10) : ");
			water_intake = sc.nextInt();

			System.out.print("Intensity of your workout : ");
			workout = sc.nextInt();

			System.out.print("Intensity of your diet : ");
			diet = sc.nextInt();

			System.out.print("Intensity of your walk : ");
			walking = sc.nextInt();

			System.out.print("Intensity of Alcohol intake : ");
			alcohol_intake = sc.nextInt();

			System.out.print("Intensity of Nicotine intake : ");
			nicotine_intake = sc.nextInt();
		}
		water_intake1 = (water_intake / 2);
		health_index = (6 *  workout) + (5 * water_intake1) + (5 * diet) + (4 * walking);

		if (age >= 10 && age <= 25)
		{
			health_index = (health_index - ((3 * nicotine_intake) + (1.5 * alcohol_intake)));
		}
		else if (age >= 26 && age <= 40)
		{
			health_index = health_index - ((3.5 * nicotine_intake) + (2.0 * alcohol_intake));
		}
		else if (age >= 41 && age <= 55)
		{
			health_index = health_index - ((4 * nicotine_intake) + (2.5 * alcohol_intake));
		}
		else if (age >= 56 && age <= 80)
		{
			health_index = health_index - ((4.5 * nicotine_intake) + (3.0 * alcohol_intake));
		}

		health_index = (health_index / 100) * 100;
		System.err.println("The health index of the person is : " + health_index + "%.");

		new waterIntake(water_intake);
		new workoutIntensity(workout);
		new dietIntensity(diet);
		new walkingIntensity(walking);
		new alcoholIntake(alcohol_intake);
		new nicotineIntake(nicotine_intake);
		
		Fitbit chart = new Fitbit("Factors", 
				"My Health Chart Central!");
		chart.pack( );        
		RefineryUtilities.centerFrameOnScreen( chart );        
		chart.setVisible( true ); 

	}
}