package com.gitikapinjani.esdminiproject.helper;

import com.gitikapinjani.esdminiproject.entity.Login;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private final Login login;

    public CustomUserDetails(Login login) {
        this.login = login;
    }

    @Override
    public String getUsername() {
        return login.getEmployees().getEmail(); // Spring uses this as the username
    }

    @Override
    public String getPassword() {
        return login.getPassword(); // Already encrypted if using bcrypt
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Implement roles if needed, or return an empty list
        // return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
        return null;
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }
}

