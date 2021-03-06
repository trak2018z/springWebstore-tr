package service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Product;
import domain.repository.ProductRepository;
import service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	public List<Product> getProductsByCategory(String category){
		return productRepository.getProductsByCategory(category);
	}
	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams){
		return productRepository.getProductsByFilter(filterParams);
	}
	
	public Product getProductById(String id) {
		return productRepository.getProductById(id);
	}
	
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
}
