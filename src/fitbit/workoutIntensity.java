package fitbit;

public class workoutIntensity
{
    public workoutIntensity(int workout)
    {
        System.out.println("Workout-Intensity : ");

        switch (workout)
        {
            case 0 :
                System.out.println("Workout is necessary for a healthy living.\n " +
                        "You must start with some physical activities.\n");
                break;
            case 1:
            case 2 :
                System.out.println("Good that you are involved in some physical fitness ! \n" +
                        "Increasing your physical activities will take your health to another level.\n");
                break;
            case 3 :
            case 4 :
                System.out.println("You are doing great ! " +
                        "You know ? Nearly 50% of all young people are not vigorously active on daily basis. \n" +
                        "Congratulations ! You are not one of them.\n");
                break;
            case 5 :
                System.out.println("MYTH:\n" + "“Fitness is not just about losing or gaining healthy weigth” \n" +
                        "Strive to feel better, increase your energy and relieve stress.\n");
                break;
        }
    }
}