package com.issac.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issac.web.dto.LoginDTO;
import com.issac.web.entity.UserInfo;
import com.issac.web.exception.InvalidLogin;
import com.issac.web.repo.UserInfoRepo;

@Service
public class UserService {

	private UserInfoRepo userRepo;

	public UserService(UserInfoRepo userRepo) {
		this.userRepo = userRepo;
	}

	public void validateLogin(LoginDTO loginDTO) {
		String userIdUI = loginDTO.getUserId();
		if (userIdUI == null || userIdUI.isBlank()) {
			throw new InvalidLogin("login user is required");
		}
		String userPwdUI = loginDTO.getUserPwd();
		if (userPwdUI == null || userPwdUI.isBlank()) {
			throw new InvalidLogin("login password is required");
		}

		List<UserInfo> userList = userRepo.findByUserId(userPwdUI);
		if (userList == null || userList.isEmpty()) {
			throw new InvalidLogin("invalid user/password");
		}

		// TODO encrypt the password while creating and check after decrypt
		UserInfo userInfo = userList.get(0);
		if (!userPwdUI.equals(userInfo.getUserPwd())) {
			throw new InvalidLogin("invalid user/password");
		}
	}
}
