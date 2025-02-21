package utils;

import java.util.HashMap;

public class UserStore {
    public static final HashMap<String, String> users = new HashMap<>();

    public static void addUser(String username, String password) {
	   users.put(username, password);
    }

    public static boolean isValidUser(String username, String password) {
	   return users.containsKey(username) && users.get(username).equals(password);
    }
    
}
