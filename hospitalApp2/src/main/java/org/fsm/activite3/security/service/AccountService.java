package org.fsm.activite3.security.service;

import org.fsm.activite3.security.entities.AppRole;
import org.fsm.activite3.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username,String password, String email, String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
