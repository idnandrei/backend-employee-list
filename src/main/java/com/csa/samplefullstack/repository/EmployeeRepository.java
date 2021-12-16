/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.repository;

import com.csa.samplefullstack.entity.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

/**
 *
 * @author Idan Paguio
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
