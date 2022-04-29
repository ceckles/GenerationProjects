package com.example.h2zoo.repositiry;/*
 * Package: com.example.h2zoo.repositiry
 * File:    MammalRepository
 * Author:  chadeckles
 * Date:    6/14/21, 11:24 AM
 * Project: h2-zoo
 * Package: com.example.h2zoo.repositiry
 * Info   :
 *
 */

import com.example.h2zoo.model.Mammals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MammalRepository extends CrudRepository<Mammals, Long> {
}
