package Assignment.MultipleInterface;

public class Facebook extends Features implements SocialMedia, MobileApp, Website {
    @Override
    void post() {
        System.out.println("Post feature gives you a option to upload pictures, videos and also you can write captions and set the current mood fo yours");
    }

    @Override
    void surf() {
        System.out.println("you can surf the facebook and can see the update on your friends have put such as pictures, videos and also moods");
    }

    @Override
    void Message() {
        System.out.println("Facebook has cool features where you can send a message to your friends and family");

    }

    @Override
    public void useAnytime() {
   System.out.println("Facebook has an app for both the ios and android user so they can access their FB account anytime on their personal device");

    }

    @Override
    public void socializeWithPeople() {
        System.out.println("Facebook is a Social Networking platform where you can share and connect with friends and family");
    }

    @Override
    public void publishData() {
         System.out.println("You can access your facebook account via their website as well");
    }
}


