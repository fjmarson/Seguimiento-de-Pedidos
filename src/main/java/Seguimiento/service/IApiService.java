package Seguimiento.service;

public interface IApiService {
    String getCustomers();
    String getOrdersByCustomer(Integer customerId);
    String getOrderStatus(Integer orderId);
}
