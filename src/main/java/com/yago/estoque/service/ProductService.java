package com.yago.estoque.service;

import com.yago.estoque.entity.Product;
import com.yago.estoque.exception.ResourceNotFoundExecption;
import com.yago.estoque.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service 
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public Product create(Product product){
        return productRepository.save(product);
    }

    public  List<Product> finAll(){
        return productRepository.findAll();
    }

    public Product findById(long id){
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExecption("Produto não encontrado com o id: " + id));
    }

    public Product update(Long id, Product productData){
        Product existingProduct=findById(id);
        existingProduct.setName(productData.getName());
        existingProduct.setPrice(productData.getPrice());
        existingProduct.setQuantity(productData.getQuantity());
        existingProduct.setMinimumStock(productData.getMinimumStock());

        return productRepository.save(existingProduct);
        
    }

    public void delete(Long id){
        Product product = findById(id);
        productRepository.delete(product);
    }

    
}
