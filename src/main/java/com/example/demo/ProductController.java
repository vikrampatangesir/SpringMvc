package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductController<listProducts> 
{
	
	@GetMapping("/product")
	public String products (Model model)
	{
          model.addAttribute("Products",getProductList() );	
          model.addAttribute("Company name","ABC enterprise");	
          return "productList";
		
	}
	
	
	private listProducts getProductList()
	{

     List<Product> productList=new ArrayList<Product>();
     productList.add(new Product(1, "logitechMouse", "dhjdjsd", 700.00, new Date()));
     productList.add(new Product(2, "DellProjector", "dhjdjdf", 800.00, new Date()));
     productList.add(new Product(3, "lenovomouse", "dhjdjsdh", 750.00, new Date()));
     
     
     
        return (listProducts) productList;
	}
}
	
	
	
