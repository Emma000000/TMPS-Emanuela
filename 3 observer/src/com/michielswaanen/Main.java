package com.michielswaanen;

import com.michielswaanen.listeners.AppNotificationListener;
import com.michielswaanen.listeners.EmailNotificationListener;
import com.michielswaanen.objects.FollowType;
import com.michielswaanen.publisher.FacebookPage;
import com.michielswaanen.objects.FacebookUser;


public class Main {

    public static void main(String[] args) {

        // Initialization
        FacebookPage facebookPage = new FacebookPage("Coding Memes");

        FacebookUser john = new FacebookUser("Ema", "emanuela patrunjel@gmail.com");
        FacebookUser jane = new FacebookUser("Ema", "emanuela patrunjel");

        // Observer Pattern

        // Ema
        AppNotificationListener johnAppNotification = new AppNotificationListener(john);

        facebookPage.follow(FollowType.VIDEO, johnAppNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, johnAppNotification);
        facebookPage.follow(FollowType.ARTICLE, johnAppNotification);

        // Inga
        EmailNotificationListener janeEmailNotification = new EmailNotificationListener(jane);
        AppNotificationListener janeAppNotification = new AppNotificationListener(jane);

        facebookPage.follow(FollowType.VIDEO, janeEmailNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, janeEmailNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, janeAppNotification);

        // Anuntă
        facebookPage.startLiveStream("https://www.youtube.com/watch?v=esX7SFtEjHg");
        facebookPage.publishVideo("https://www.youtube.com/watch?v=esX7SFtEjHg");

        facebookPage.unfollow(FollowType.LIVE_STREAM, janeAppNotification);

        facebookPage.startLiveStream("https://www.youtube.com/watch?v=esX7SFtEjHg");
        facebookPage.publishArticle("https://www.youtube.com/watch?v=esX7SFtEjHg");
    }
}
