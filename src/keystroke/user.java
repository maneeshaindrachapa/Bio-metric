/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.util.ArrayList;

/**
 *
 * @author Maneesha
 */
public class user {
    private String username;
    private String password;
    private ArrayList<String> timeElapsed=new ArrayList<>();
    
    user(String username,String password,ArrayList<String> timeElapsed){
        this.username=username;
        this.password=password;
        for(int i=0;i<timeElapsed.size();i++){
            this.timeElapsed.add(timeElapsed.get(i));
        }
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the timeElapsed
     */
    public ArrayList<String> getTimeElapsed() {
        return timeElapsed;
    }
}
