package mytest;

import com.dao.UserDaoMapper;
import com.entity.S_user;
import com.service.UserServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybaitSpringTest {

    @Autowired
    private UserServiceInterface serviceInterface;

    @Autowired
    private UserDaoMapper mapper;

    @Test
    public void test(){
        System.out.println(666);

        S_user s_user = serviceInterface.login("孙悟空","666");
        System.out.println(s_user.toString());
    }

    @Test
    public void test2(){
        S_user s_user=new S_user();
        s_user.setS_userName("孙悟空");
        s_user.setS_password("666");
        s_user = mapper.login2(s_user);
        System.out.println(s_user.toString());
    }
}
