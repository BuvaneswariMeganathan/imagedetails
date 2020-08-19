package com.next99.imagedetails.dao;

import java.util.List;

import com.next99.imagedetails.entity.Images;

/**ImagesDao used to handle repository calls.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
public interface ImagesDao{

	/**retrieveImagesDetails method used to retrieve all the Image details.
	 * 
	 * 
	 * @return List<Images>
	 */
	List<Images> retrieveImagesDetails();
	
	/**saveImageDetails method used to save the Image details given by the user.
	 * 
	 * @param Images
	 * 
	 */
	void saveImageDetails(Images Images);

	/**getImageById method used to get Image details using id.
	 * 
	 * @param id
	 * 
	 * @return Images
	 */
	Images getImageById(long id);

	/**saveOrUpdate method used to save or update the Image details using id.
	 * 
	 * 
	 * @param id
	 */
	void saveOrUpdate(Images images);

	/**deleteImage method used to delete the Image details using id.
	 * 
	 * 
	 * @param id
	 */
	void deleteImage(long id);


}
