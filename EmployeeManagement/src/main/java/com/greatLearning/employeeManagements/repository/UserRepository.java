package com.greatLearning.employeeManagements.repository;

import com.greatLearning.employeeManagements.entity.User;

public interface UserRepository {

	public User getUserByUsername(String username);

}
