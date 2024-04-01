package com.issac.web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.issac.web.entity.UserInfo;

@Repository
public interface UserInfoRepo extends CrudRepository<UserInfo, String> {
	List<UserInfo> findByUserId(String userId);
}
