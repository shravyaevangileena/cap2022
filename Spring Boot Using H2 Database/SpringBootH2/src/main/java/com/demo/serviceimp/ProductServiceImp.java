package com.demo.serviceimp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.productrepositary.ProductRepositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepositary productRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Product addProductDetails(Product product) {
         //add mlgoic        save method 
		return productRespositary.save(product);

	}
	@Override
     public List<Product> getListOfProducts() {
		List<Product> pr=new ArrayList<Product>();
		productRespositary.findAll().forEach(pr::add);
		return pr;
	}

	@Override
	public Product updateProductDetailsBtyId(Product product,long id) {
		product.setId(id);
		product.getColor();
		product.getOs();
		product.getProductname();
		product.getSpecification();
		Product prod=productRespositary.save(product);
			return prod;
		
		}
	
		

	// logic here
	@Override
	public Optional<Product> getDetailsById(long id) {
		Optional<Product> detailsOfproduct = productRespositary.findById(id);
		return detailsOfproduct;
	}
   
	@Override
	public void deleteProductById(long id) {
		productRespositary.deleteById(id);
		
	

	}
	

}
