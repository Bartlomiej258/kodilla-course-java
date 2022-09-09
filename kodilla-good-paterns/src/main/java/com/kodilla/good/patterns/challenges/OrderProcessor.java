package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final InformationServiceInterface informationService;
    private final OrderRepositoryInterface orderRepository;
    private final OrderServiceInterface orderService;

    public OrderProcessor(final InformationServiceInterface informationService,
                          final OrderRepositoryInterface orderRepository,
                          final OrderServiceInterface orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getFrom(),
                orderRequest.getTo(),
                orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getFrom(), orderRequest.getTo(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
