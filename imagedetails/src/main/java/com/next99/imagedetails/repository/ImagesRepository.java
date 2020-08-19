package com.next99.imagedetails.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.next99.imagedetails.entity.Images;

/**ImagesRepository used to handle repository funcitons.
 * 
 * @author Buvaneswari Meganathan
 * @since 20.08
 *
 */
@Repository
public interface ImagesRepository extends JpaRepository<Images, Long> {

}
