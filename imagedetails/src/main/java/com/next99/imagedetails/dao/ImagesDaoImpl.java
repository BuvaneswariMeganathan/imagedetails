package com.next99.imagedetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.next99.imagedetails.entity.Images;
import com.next99.imagedetails.repository.ImagesRepository;

/**ImagesDaoImpl used to implement ImagesDao.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Component
public class ImagesDaoImpl implements ImagesDao{

	 @Autowired
	 private ImagesRepository imagesRepository;
	 	 
	 public ImagesDaoImpl(ImagesRepository imagesRepository) {
		  super();
		  this.imagesRepository = imagesRepository;
		 }
	 
	@Override
	public List<Images> retrieveImagesDetails() {
		return imagesRepository.findAll();
	}

	@Override
	public void saveImageDetails(Images Images) {
		imagesRepository.save(Images);
		
	}

	@Override
	public Images getImageById(long id) {
		return imagesRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Images images) {
		imagesRepository.save(images);
		
	}

	@Override
	public void deleteImage(long id) {
		imagesRepository.deleteById(id);
		
	}


}
