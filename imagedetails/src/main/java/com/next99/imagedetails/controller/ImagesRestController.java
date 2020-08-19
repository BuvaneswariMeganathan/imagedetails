package com.next99.imagedetails.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.next99.imagedetails.entity.Images;
import com.next99.imagedetails.service.ImagesService;



/**ImagesRestController used to control the Image related functions.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@RestController
public class ImagesRestController {
	
	 @Autowired
	 private ImagesService imagesService;
	 	 
	 public ImagesRestController(ImagesService imagesService) {
		  super();
		  this.imagesService = imagesService;
		 }
	 
	 @RequestMapping(value="/images", method=RequestMethod.GET)    
	 public ModelAndView list()  
	 {    
	 ModelAndView modelAndView = new ModelAndView();    
	 modelAndView.setViewName("images_list");        
	 modelAndView.addObject("imagesList", imagesService.retrieveImagesDetails());      
	 return modelAndView;    
	 }  
	 
	 @RequestMapping(value="/addImage", method=RequestMethod.GET)
	 public ModelAndView addImage() {
	  ModelAndView model = new ModelAndView();
	  Images images = new Images();
	  model.addObject("imagesForm", images);
	  model.setViewName("images_form");
	  return model;
	 }
	 
	 @RequestMapping(value="/updateImage/{id}", method=RequestMethod.GET)
	 public ModelAndView editArticle(@PathVariable long id) {
	  ModelAndView model = new ModelAndView();
	  Images article = imagesService.getImageById(id);
	  model.addObject("imagesForm", article);
	  model.setViewName("images_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveImage", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("imagesForm") Images images) {
		 imagesService.saveOrUpdate(images);
	  
	  return new ModelAndView("redirect:/images");
	 }
	 
	 @RequestMapping(value="/deleteImage/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") long id) {
		 imagesService.deleteImage(id);
	  
	  return new ModelAndView("redirect:/images");
	 }
}
