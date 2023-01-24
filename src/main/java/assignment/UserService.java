package assignment;

import org.mockito.Mock;

import static org.mockito.Mockito.when;

public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public boolean authenticate(User user, String password){
        return false;
    }

    public User findByUsername(String username) {
        return userRepo.getUserByUsername(username).orElseThrow();
    }
}
