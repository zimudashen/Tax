package nsfw.user.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
	private UserRoleId id;

	public UserRoleId getId() {
		return id;
	}

	public void setId(UserRoleId id) {
		this.id = id;
	}

	public UserRole(UserRoleId id) {
		this.id = id;
	}

	public UserRole() {
	}
	
}
