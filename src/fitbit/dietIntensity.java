package fitbit;

public class dietIntensity
{
    public dietIntensity(int diet)
    {
        System.out.println("Diet-Intensity : ");

        switch (diet)
        {
            case 0 :
            case 1 :
                System.out.println("Diet doesn't mean that you have to eat what you don't like. " +
                        "What's good for your body actually tastes good too. Try it.\n");
                break;
            case 2 :
            case 3 :
                System.out.println("A good diet is the most important part of good health. \n" +
                        "What you are eating is what your body is made up of. Try to take proper nutrition full diet\n");
                break;
            case 4 :
            case 5 :
                System.out.println("Your diet is impressive. Keep it up !!\n");
                break;

        }
    }
}
