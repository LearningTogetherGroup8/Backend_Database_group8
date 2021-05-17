package com.reasteasy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reasteasy.DAO.AddressRepository;
import com.reasteasy.DAO.CustomerRepository;
import com.reasteasy.DAO.OrderCustomerRepository;
import com.reasteasy.DAO.OrderItemRepository;
import com.reasteasy.DAO.OrdersRepository;
import com.reasteasy.DAO.ProductRepository;
import com.reasteasy.entity.Address;
import com.reasteasy.entity.Customer;
import com.reasteasy.entity.OrderCustomer;
import com.reasteasy.entity.OrderItem;
import com.reasteasy.entity.Orders;
import com.reasteasy.entity.Product;
@Service
public class CheckoutServiceImpl implements CheckoutService{
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	OrderItemRepository orderItemRepository;
	@Autowired
	OrderCustomerRepository orderCustomerRepository;
	@Override
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	@Override
	public List<Customer> findByEmail(String theEmail) {
		return customerRepository.findAll().stream().filter(x->x.getEmail().equalsIgnoreCase(theEmail)).collect(Collectors.toList());
	}
	@Override
	public List<Product> findAllProduct() {
		
		return productRepository.findAll();
	}
	@Override
	public Product saveProduct(Product theProduct) {
		
		return productRepository.saveAndFlush(theProduct);
	}
	@Override
	public List<Address> findAllAddress() {
	
		return addressRepository.findAll();
	}
	@Override
	public Address saveAddress(Address theAddress) {
		
		return addressRepository.saveAndFlush(theAddress);
	}
	@Override
	public List<OrderCustomer> findAllOrderCustomer() {
		
		return orderCustomerRepository.findAll();
	}
	@Override
	public OrderCustomer saveOrderCustomer(OrderCustomer theorderCustomer) {
		
		return orderCustomerRepository.saveAndFlush(theorderCustomer);
	}
	@Override
	public List<Orders> findAllOrders() {
		
		return ordersRepository.findAll();
	}
	@Override
	public Orders saveOrders(Orders theorders) {
		
		return ordersRepository.saveAndFlush(theorders);
	}
	@Override
	public List<OrderItem> findAllOrderItem() {
		
		return orderItemRepository.findAll();
	}
	@Override
	public OrderItem saveOrderItem(OrderItem theorderItem) {
		
		return orderItemRepository.saveAndFlush(theorderItem);
	}
	
	

}
