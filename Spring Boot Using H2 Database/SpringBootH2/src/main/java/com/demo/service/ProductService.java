package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;

@Service
public interface ProductService {
	// POST
	Product addProductDetails(Product prodcut);   

	// GET
	 List<Product> getListOfProducts();
		// TODO Auto-generated method stub
		
	  

	/// PUT
     Product  updateProductDetailsBtyId(Product product,long id); 

	// GET
	Optional<Product> getDetailsById(long id);   

	// delete by id
	  void deleteProductById(long id) ;
		// TODO Auto-generated method stub
		
	  
	
	
}



