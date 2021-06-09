package net.odev.ws;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private static UserDAO instance;
	private static List<User> data = new ArrayList<>();
	
	static {
        data.add(new User(1,"Yusuf", "yusuff@gmail.com", "Tukey"));
        data.add(new User(2, "Ali", "ali@hotmail.com", "Turkey"));     
    }

	private UserDAO() {
	}
	
	public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;               
    }
	
	public List<User> listAll() {
        return new ArrayList<User>(data);
    }
	
	public User add(User user) {
        data.add(user);
        return user;
    }
	
	public User get(int id) {
        User userToFind = new User(id);
        int index = data.indexOf(userToFind);
        if (index >= 0) {
            return data.get(index);
        }
        return null;
    }
	
	public boolean update(int id,String name,String email,String country) {
		User userToFind = new User(id);
        int index = data.indexOf(userToFind);
		if (index >= 0) {
			userToFind.setName(name);
			userToFind.setEmail(email);
			userToFind.setCountry(country);
            data.set(index, userToFind);
            return true;
        }
        return false;
    }
	
	public boolean delete(int id) {
		User userToFind = new User(id);
        int index = data.indexOf(userToFind);
        if (index >= 0) {
            data.remove(index);
            return true;
        }
         
        return false;
    }
}
