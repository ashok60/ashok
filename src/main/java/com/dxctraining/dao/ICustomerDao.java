package customerdemo.dao;

	import java.util.List;

	import customerdemo.entities.Customer;

public interface ICustomerDao {
					
	Customer findByCustomerId(String CustomerId);

	List<Customer> findAll() ;
		
	Customer updateCustomerId(String CustomerId);

	void add(Customer customer);
		
	Customer update(Customer customer);
		
	void delete(String CustomerId);
		
}



