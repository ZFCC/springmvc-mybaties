package springmvc_mybaties;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.domain.User;
import com.my.service.UserService;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContent.xml"})
public class UserDaoTest {

	@Autowired
	UserService userService;
	
	@Test
	public void getUserByIdTest(){
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
	}
	
	@Test
	public void insert(){
		User user = new User();
		user.setId(2);
		user.setPassword("123123");
		user.setAge(20);
		user.setUserName("小hua");
		int result = userService.insert(user);
		System.out.println(result);
	}
	@Test
	public void update(){
		User user = new User();
		user.setId(1);
		user.setPassword("123321");
		user.setAge(20);
		user.setUserName("小明");
		int result = userService.updateByPrimaryKey(user);
		System.out.println(result);
	}
	
	@Test
	public void insertSelective(){
		User user = new User();
		user.setId(3);
		user.setPassword("1221");
		user.setAge(20);
		user.setUserName("小红");
		int result = userService.insertSelective(user);
		System.out.println(result);
	}
	
	@Test
	public void getByNameAndPassword(){
		String name="小明";
		String password = "123";
		User user = userService.getUserByNameAndPassword(name, password);
		System.out.println(user);
	}
	@Test
	public void getall(){
		List<User> list = userService.getAllUser();
		for(User user: list){
			System.out.println(user);
		}
		
	}
}
