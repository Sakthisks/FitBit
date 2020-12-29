package fitbit;

public class alcoholIntake
{
    public alcoholIntake(int alcohol)
    {
        System.out.println("Alcohol-Intake : ");

        switch (alcohol)
        {
            case 0 :
                System.out.println("Good that you don't consume alcohol.\n");
                break;
            case 1 :
            case 2 :
                System.out.println("Eat enough before you consume alcohol. " +
                        "Prefer clear liquids over dark liquids to avoid hangover.\n");
                break;
            case 3 :
            case 4 :
                System.out.println("Consume a lot of water as alcohol dehydrates your body." +
                        "Alcohol interferes with vitamin and mineral absorption and can even lead to nutrient deficiencies. " +
                        "Make sure you consume enough nutrients and cut down on you alcohol intake for a healthy lifestyle.\n");
                break;
            case 5 :
                System.err.println("Alert !!");
                System.out.println("Cut down on your alcohol intake !!\n");
                break;
        }
    }
}
