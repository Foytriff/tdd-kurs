package assignment;

import org.mockito.Mock;

import static org.mockito.Mockito.when;

public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public boolean authenticate(String username, String password){



        return false;
    }

    public User findByUsername(String username) {
        return null;
        //return userRepo.getUserByUsername(username).orElseThrow();
    }
}
