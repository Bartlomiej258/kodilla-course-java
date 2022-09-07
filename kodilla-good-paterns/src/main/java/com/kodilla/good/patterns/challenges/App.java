package com.kodilla.good.patterns.challenges;

public class App {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = new OrderRequestRetriever().retrieve();

        OrderProcessor orderProcessor = new OrderProcessor((InformationServiceInterface) new MailService(), new OrderRepository(), new ProductOrderService());

        orderProcessor.process(orderRequest);
    }
}
