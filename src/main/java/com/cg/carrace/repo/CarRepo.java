/**
 * 
 */
package com.cg.carrace.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.carrace.entity.CarBean;

/**
 * @author kneware
 *
 */

@Repository
public interface CarRepo extends CrudRepository<CarBean, Integer> {

	/*To perform CRUD operations interface CarRepo extending CrudRepository.*/

}
