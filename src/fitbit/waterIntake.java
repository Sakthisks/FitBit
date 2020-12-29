package fitbit;

public class waterIntake
{
    public waterIntake(int water)
    {
        System.out.println("Water-Intake : ");

        switch(water)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Body is made of 70 % water.\n" + "You should double the amount of your water intake.\n");
                break;
            case 4 :
            case 5 :
                System.out.println("Your water intake is not very less,\n" + "but is still below the recommended amount.\n" +
                        "Drink couple of more glasses of water.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("You are drinking enough amount of water.\n" + "But increasing the amount will always be beneficial.\n");
                break;
            case 9 :
            case 10 :
                System.out.println("Congratulations ! You are drinking more water than 90% of the people on the Earth.\n" +
                        "Keep it up !\n");
                break;
        }
    }
}
