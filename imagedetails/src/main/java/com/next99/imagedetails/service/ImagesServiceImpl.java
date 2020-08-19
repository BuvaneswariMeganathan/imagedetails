package com.next99.imagedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.next99.imagedetails.dao.ImagesDao;
import com.next99.imagedetails.entity.Images;

/**ImagesServiceImpl used to implement ImagesService.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Service
public class ImagesServiceImpl implements ImagesService {

	 @Autowired
	 private ImagesDao imagesDao;
	 	 
	 public ImagesServiceImpl(ImagesDao imagesDao) {
		  super();
		  this.imagesDao = imagesDao;
		 }
	 
	@Override
	public List<Images> retrieveImagesDetails() {
		return imagesDao.retrieveImagesDetails();
	}

	@Override
	public void saveImageDetails(Images Images) {
		imagesDao.saveImageDetails(Images);
	}

	@Override
	public Images getImageById(long id) {
		return imagesDao.getImageById(id);
	}

	@Override
	public void saveOrUpdate(Images images) {
		imagesDao.saveOrUpdate(images);
	}

	@Override
	public void deleteImage(long id) {
		imagesDao.deleteImage(id);
		
	}

}
