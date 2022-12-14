package com.yash.project.login.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyWebUserDetails implements UserDetails {
	  private String userName;
	  private String password;
	  private boolean active;
	  private List<GrantedAuthority> authorities;
		
	  public MyWebUserDetails(web_user objuser)
	  {
		  this.userName=objuser.getUserName();
		  this.password=objuser.getPassword();
		  this.active=objuser.isActive();
		  this.authorities = Arrays.stream(objuser.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	  }
	  @Override
	  public  Collection<? extends GrantedAuthority> getAuthorities()
	  {
		  return authorities;
	  }
	  @Override
	  public String getPassword()
	  {
		  return password;
	  }
	  @Override
	  public String getUsername()
	  {
		  return userName;
	  }
	   
	  @Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}

