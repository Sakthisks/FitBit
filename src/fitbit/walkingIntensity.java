package fitbit;

public class walkingIntensity
{
    public walkingIntensity(int walk)
    {
        System.out.println("Walking Intensity : ");

        switch (walk)
        {
            case 0 :
            case 1 :
            case 2 :
                System.out.println("Try to increase you walking routine. " +
                        "Some suggestions to build walking into your daily routine include:\n" +
                        "• Take the stairs instead of the lift (for at least part of the way).\n" +
                        "• Get off public transport one stop earlier and walk to work or home.\n" +
                        "• Walk (don’t drive) to the local shops.\n" +
                        "• Walk the dog (or your neighbor’s dog)\n" +
                        "Try to join some walking clubs.\n");
                break;
            case 3 :
            case 4 :
                System.out.println("See your doctor for a medical check-up before starting a new fitness program, \n" +
                        "particularly if you are aged over 40 years, are overweight or haven’t exercised in a long time. \n" +
                        "Drink plenty of fluids before and after your walk. If you are taking a long walk, take water with you.\n");
                break;
            case 5 :
                System.out.println("Keep up the good work!! Try to take a balanced diet along with it.\n");
                break;
        }
    }
}
