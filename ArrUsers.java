package arrayList;

import java.util.ArrayList;
import java.util.List;

class User
{
	private String name;
	private int age;
	public User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName()
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge()
	{
		this.age = age;
	}
}



public class ArrListOfUser {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		users.add(new User("Nalin", 1));
		users.add(new User("Lily", 4));
		users.add(new User("Lyla", 3));
		users.add(new User("Jason", 2));
		
		users.forEach(user -> {
			System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
		});
	}
	
}





