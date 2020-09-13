package com.promineotech.socialmediaapi.view;

import java.util.Set;

import com.promineotech.socialmediaapi.entity.User;

public class Following {

	private Set<User> following;
	
	public Following(User user) {
		following = user.getFollowing();
	}
	
	public Set<User> getFollowing() {
		return following;
	}
	
	public void setFollowing(Set<User> following) {
		this.following = following;
	}
}
