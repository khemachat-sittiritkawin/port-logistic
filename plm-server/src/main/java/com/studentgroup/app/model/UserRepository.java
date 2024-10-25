package com.studentgroup.app.model;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface UserRepository extends CrudRepository<EmployeeUser, String> {
    EmployeeUser findByToken(String token);
    EmployeeUser findByUsername(String username);
}
