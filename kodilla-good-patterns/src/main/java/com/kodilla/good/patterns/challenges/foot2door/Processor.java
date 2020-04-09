package com.kodilla.good.patterns.challenges.foot2door;

public class Processor {
    private InformationService informationService;
    private PurchaseService purchaseService;

    public Processor(final InformationService informationService,
                     final PurchaseService purchaseService) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
    }

    public DTO process (final ProducerRequest producerRequest) {
        boolean isOrdered = purchaseService.purchase(producerRequest.getProducer(), producerRequest.getProduct());
        if (isOrdered) {
            informationService.inform(producerRequest.getProducer());
            return new DTO(producerRequest.getProducer(), producerRequest.getProduct().getQuantityOfProduct());
        } else {
            return new DTO(producerRequest.getProducer(), 0);
        }

    }
}
