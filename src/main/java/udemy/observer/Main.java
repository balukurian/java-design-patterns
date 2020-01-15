package udemy.observer;

import udemy.observer.interfaces.Observer;
import udemy.observer.models.EmailTopic;
import udemy.observer.models.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        // check for updates
        firstObserver.update();

        emailTopic.postMessage("Hello Subscriber");
        emailTopic.postMessage("Hello Subscriber1");

    }
}
