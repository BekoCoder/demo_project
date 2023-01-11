package service;

import model.User;

public class AuthService implements BaseService {
    private User userList[] = new User[100];
    private int  index=0;

    public User register(final User user){
        for (User user1: userList) {
            if(user1!=null){
                if(user1.getUsername().equals(user.getUsername()) && user1.getPassword().equals(user.getPassword())){
                            return user1;
                }
            }
        }

        return null;
    }

    public boolean login(final String username, final String password){
        for (User user: userList) {
            if(user!=null){
                if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
    private User doesHasUser(final String username){

        return null;
    }


    @Override
    public boolean add(Object object) {
        User user= (User) object;
        for (User user1: userList) {
            if(user1!=null){
                if(user1.getUsername().equals(user.getUsername())){
                    return false;
                }
            }
        }

    userList[index++]=user;
        return true;
    }
}
