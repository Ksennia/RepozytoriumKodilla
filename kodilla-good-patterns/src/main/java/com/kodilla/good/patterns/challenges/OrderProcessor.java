package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderServiсe orderServiсe;
    private OrderRepository orderRepository;

    public OrderProcessor( final InformationService informationService,
                           final OrderServiсe orderServiсe,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderServiсe = orderServiсe;
        this.orderRepository = orderRepository;
    }
    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderServiсe.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true );
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
