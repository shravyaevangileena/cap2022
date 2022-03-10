package com.demo.controller;
import java.util.List;
import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.demo.pojo.Product;
import com.demo.service.ProductService;
import com.demo.serviceimp.ProductServiceImp;

	/**
	 * @author Admin
	 *
	 */
	@RestController
	@RequestMapping("/prod")
	public class ProductController {

		//dependency injected her of service class
		@Autowired
		ProductServiceImp productServiceImp;
	    
		/**
		 *  this method retrieved the details of Product by id
		 * @param productid
		 * @return
		 */ 
		@GetMapping(value = "/getproductbyid/{id}")
		public 	Optional<Product> getProductDetailsById(@PathVariable("id") long productid) {
			System.out.println("inside Optional<Product> getProductDetailsById(@PathVariable(\"id\") long productid"+productid);
	           // java 8 force me to add Optional<Product> 
			Optional<Product> prodresult = productServiceImp.getDetailsById(productid);
			
			return prodresult;

		}
		@GetMapping(value= "/list")
		public List<Product> getListOfProducts(){
			return productServiceImp.getListOfProducts();
		}
		
		@PutMapping(value="/update/{id}")
		public Product updateProductDetailsBtyId(@RequestBody Product product, @PathVariable long id){
		return productServiceImp.updateProductDetailsBtyId(product,id);
		}
		
		@DeleteMapping("/delete/{id}")  
		public String deleteProductById(@PathVariable("id") long id)   
		{  
			
				try {
					
					Optional<Product> p = getProductDetailsById(id);  //if it exist in db thne it return id
					
					if(p!=null) {
					
					productServiceImp.deleteProductById(id);
					return "deleted";
					}
					
					

				}catch(Exception e) {
					
				e.printStackTrace();
					
				}
				return "id not found";
				
			}
		
		/**
		 * @param product
		 * @return
		 */
		@PostMapping(value = "/addproduct")
		public String addProductDetailsBy(@RequestBody Product product) {

			Product p = productServiceImp.addProductDetails(product);

			if (p != null) {
				return "insert sucessfully";

			} else {

				return "insert not sucessfully";
			}

		}

	}


