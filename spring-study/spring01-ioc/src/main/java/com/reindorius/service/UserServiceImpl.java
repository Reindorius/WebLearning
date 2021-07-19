package com.reindorius.service;

import com.reindorius.reindo.UserReindo;
import com.reindorius.reindo.UserReindoImpl;

public class UserServiceImpl implements UserService{
    private UserReindo userReindo = new UserReindoImpl();

    //by adding this setter shall we be able to dynamically choose what detailed serviced to be implemented
    public void setUserReindo(UserReindo userReindo) { this.userReindo = userReindo; }

    @Override
    public void getUser() {
        userReindo.getUser();
    }
}
