package TH_Facade;

public class SocialMediaFacade {
    private Twitter twitter;
    private LinkedIn linkedIn;
    private Facebook facebook;

    public SocialMediaFacade(Twitter twitter, LinkedIn linkedIn, Facebook facebook) {
        this.twitter = twitter;
        this.linkedIn = linkedIn;
        this.facebook = facebook;
    }

    public void share(String message) {
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.setMessage(message);
        facebook.share();
        linkedIn.share();
        twitter.share();
    }
}
