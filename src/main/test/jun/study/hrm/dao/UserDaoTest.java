package jun.study.hrm.dao;

import jun.study.hrm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.print.attribute.standard.PrinterURI;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectByLoginnameAndPassword() {
        User admin = userDao.selectByLoginnameAndPassword("admin", "123456");
    }
}