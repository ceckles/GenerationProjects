package com.example.h2zoo.repositiry;/*
 * Package: com.example.h2zoo.repositiry
 * File:    AvianRepository
 * Author:  chadeckles
 * Date:    6/14/21, 11:32 AM
 * Project: h2-zoo
 * Package: com.example.h2zoo.repositiry
 * Info   :
 *
 */

import com.example.h2zoo.model.Avian;
import org.springframework.data.repository.CrudRepository;

public interface AvianRepository extends CrudRepository<Avian, Long> {
}
