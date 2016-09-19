package kouclo.dubbo;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
		 return "Hello " + name;
	}
    
	public List<User> getUsers() {
		User user=new User();
		user.setName("张三");
		user.setAddress("BEIJING");
		user.setAge(19);
		User user1=new User();
		user1.setName("李四");
		user1.setAddress("上海");
		user1.setAge(32);
		
		List<User> list=new ArrayList<User>();
		list.add(user1);
		list.add(user);
		
		return list;
	}

	 public String sayFuck(String name) {
		// TODO Auto-generated method stub
		 return "Fuck " + name;
	 }

}
