package udemy.observer.models;

import udemy.observer.interfaces.Observer;
import udemy.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null)
            System.out.println(name + " : no new message on this topic");
        else
            System.out.println(name + " : " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
