package com.next99.imagedetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Images used as an entity for getting and setting the appropriate values
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Entity
@Table(name="Images")
public class Images {
  
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 @Column(name="image_names")
 private String imageNames;
  
 @Column(name="image_trax")
 private String imageTrax;
  
 @Column(name="image_description")
 private String imageDescription;
  
 @Column(name="relative_image")
 private String relativeImage;
 
 public Images() {
	 
 }
 
 public Images(String imageNames, String imageTrax, String imageDescription, String relativeImage) {
	  super();
	  this.imageNames = imageNames;
	  this.imageTrax = imageTrax;
	  this.imageDescription = imageDescription;
	  this.relativeImage = relativeImage;
 }
 
 public long getId() {
	  return id;
	 }

	 public void setId(long id) {
	  this.id = id;
	 }


public String getImageNames() {
	return imageNames;
}

public void setImageNames(String imageNames) {
	this.imageNames = imageNames;
}

public String getImageTrax() {
	return imageTrax;
}

public void setImageTrax(String imageTrax) {
	this.imageTrax = imageTrax;
}

public String getImageDescription() {
	return imageDescription;
}

public void setImageDescription(String imageDescription) {
	this.imageDescription = imageDescription;
}

public String getRelativeImage() {
	return relativeImage;
}

public void setRelativeImage(String relativeImage) {
	this.relativeImage = relativeImage;
}

}
