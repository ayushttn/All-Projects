package com.springdata.productdata;

import com.springdata.productdata.entities.Product;
import com.springdata.productdata.repos.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductdataApplicationTests {

    @Autowired
    ProductRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreate(){
        Product product = new Product();
        product.setId(1);
        product.setName("Iphone");
        product.setDesc("XR");
        product.setPrice(10000d);
        repository.save(product);
    }

    @Test
    public void testRead(){
        Product product = repository.findById(1).get();
        assertNotNull(product);
        assertEquals("Iphone", product.getName());
    }

    @Test
    public void testUpdate(){
        Product product = repository.findById(1).get();
        product.setPrice(1200d);
        repository.save(product);
    }

    @Test
    public void testDelete(){
        if(repository.existsById(1)){
            System.out.println("Deleting a product");
            repository.deleteById(1);
        }
    }

    @Test
    public void testCount(){
        System.out.println("Total Records" + repository.count());
    }

    @Test
    public void testFindByName(){
        List<Product> products = repository.findByName("IWatch");
        products.forEach(p -> System.out.println(p.getPrice()));
    }

    @Test
    public void testFindByNameAndDesc(){
        List<Product> products = repository.findByNameAndDesc("TV", "From Samsung");
        products.forEach(p -> System.out.println(p.getPrice()));
    }

    @Test
    public void testFindByPriceGreaterThan(){
        List<Product> products = repository.findByPriceGreaterThan(100d);
        products.forEach(p -> System.out.println(p.getName()));
    }

    @Test
    public void testFindByDescContains(){
        List<Product> products = repository.findByDescContains("Apple");
        products.forEach(p -> System.out.println(p.getName()));
    }


    @Test
    public void testFindPriceBetween(){
        List<Product> products = repository.findByPriceBetween(100d, 1000d);
        products.forEach(p -> System.out.println(p.getName()));
    }


    @Test
    public void testFindByDescLike(){
        List<Product> products = repository.findByDescLike("%LG%");
        products.forEach(p -> System.out.println(p.getName()));
    }


    @Test
    public void testFindById(){
        Pageable pageable = PageRequest.of(1, 2);
        List<Product> products = repository.findByIdIn(Arrays.asList(1,2,3,4), pageable);
        products.forEach(p -> System.out.println(p.getName()));
    }


    @Test
    public void testFindAllPaging(){
        Pageable pageable = PageRequest.of(1,2);
        Page<Product> results = repository.findAll(pageable);
        results.forEach(p -> System.out.println(p.getName()));
    }


    @Test
    public void testFindAllSorting(){
        repository.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name"), Sort.Order.by("price"))).forEach(p -> System.out.println(p.getName()));
        //repository.findAll(Sort.by(Sort.Direction.DESC, "name", "price")).forEach(p -> System.out.println(p.getName()));

    }


    @Test
    public void testFindAllPagingAndSorting(){
        Pageable pageable = PageRequest.of(0,2, Sort.Direction.DESC, "name");
        repository.findAll(pageable).forEach(p -> System.out.println(p.getName()));
    }
}
