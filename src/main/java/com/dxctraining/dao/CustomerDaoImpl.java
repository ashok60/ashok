package customerdemo.dao;
import customerdemo.entities.*;
import customerdemo.exception.CustomerNotFoundException;
import java.util.*;

public class CustomerDaoImpl  {

	private Map<String, Customer> store = new HashMap<>();

	private String fetchCustomerId;

	private String fetchCustomerId() {
		return fetchCustomerId;

	}

	public Customer findByCustomerId(String CustomerId) {
		Customer customer = store.get(CustomerId);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found for CustomerId=" + CustomerId);
		}
		return customer;
	}

	  public List<Customer> findAll() {
		Collection<Customer> values = store.values();
		List<Customer> list = new ArrayList<>();
		for (Customer value : values) {
			list.add(value);
		}
		return list;
	}

	public void add(Customer customer) {

		String CustomerId = fetchCustomerId();
		store.put(CustomerId, customer);

	}

	public Customer update(Customer customer) {
		String CustomerId = customer.getCustomerId();
		store.put(CustomerId, customer);
		return customer;
	}

	public void delete(String CustomerId) {
		store.remove(CustomerId);
	}
}
