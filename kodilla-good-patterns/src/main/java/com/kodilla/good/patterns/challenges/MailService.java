package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class MailService implements InformationService {
    private boolean userMadeOrder = true;
    private List<String> mails;
    @Override
    public void inform(User user) {
        if ( userMadeOrder) {
            System.out.println( user.getName() + " " + user.getSurname() + " Thank you! Wait on the order a few days)");

        }
    }
    public void saveMail (User user) {
        List<String> mails = new ArrayList();
        mails.add(user.getMailAdress());
    }
}
