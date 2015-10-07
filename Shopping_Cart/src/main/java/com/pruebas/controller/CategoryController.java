package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Category;
import com.pruebas.service.CategoryServiceImp;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImp categoryServiceImp;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public List<Category> listCategory(){
		List<Category> category = categoryServiceImp.getEntities();
		return category;//opcion filtrar con json ignore
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Category> createCategory(@RequestBody Category category) {
		categoryServiceImp.addEntity(category);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getProduct/{id}" , method=RequestMethod.GET )
	public String getProduct(@PathVariable int id){
		Category category = this.categoryServiceImp.getEntity(id);
		return category.getProductList().toString();
	}
}
