package fitbit;

public class nicotineIntake
{
    public nicotineIntake(int nicotine)
    {
        System.out.println("Nicotine-Intensity : ");

        switch (nicotine)
        {
            case 0 :
            case 1 :
            case 2 :
                System.out.println("Things a smoker can do to stay healthy: \n" +
                        "•\tEat a healthy diet, rich in fresh fruits and vegetables\n" +
                        "•\tEngage in regular exercise\n" +
                        "•\tVisit your doctor for check-ups and make sure you’ve had your flu shot\n" +
                        "•\tManage your stress levels\n");
                break;
            case 3 :
                System.out.println("In order to counteract the extremely injurious repercussions of nicotine intake, " +
                        "it is important that you realize the significance of a healthy dietary regimen.\n" +
                        "Being active can curb nicotine cravings and ease some withdrawal symptoms. \n" +
                        "Healthy diet recommended for smokers include leafy greens, loads of roughage, fresh & seasonal fruits and whole grain cereals.\n");
                break;
            case 4 :
            case 5 :
                System.out.println("Cut down on your nicotine consumption. Seek professional help if necessary.\n");
                break;
            
        }
    }
}