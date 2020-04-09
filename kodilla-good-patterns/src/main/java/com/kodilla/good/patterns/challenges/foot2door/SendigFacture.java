package com.kodilla.good.patterns.challenges.foot2door;

import java.util.ArrayList;

public class SendigFacture implements InformationService {
    private ArrayList<String> factures;
    @Override
    public void inform(Producer producer) {
        System.out.println("Send the mail with facture");
        factures = new ArrayList<>();
        factures.add(producer.getName());

    }
}
