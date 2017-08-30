import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.qmy3.Test.domain.Customer;

public class Demo1 {
	/**
     * 测试保存客户
     */
    @Test
    public void testSave(){
    	
    	System.out.println("qmy3 ==== 0");
        // 先加载配置文件
        Configuration config = new Configuration();
        // 默认加载src目录下的配置文件
        config.configure();
        
        System.out.println("qmy3 ==== 01");
        // 创建SessionFactory对象
        SessionFactory factory = config.buildSessionFactory();
        // 创建session对象
        Session session = factory.openSession();
        // 开启事务
        Transaction tr = session.beginTransaction();
        // 编写保存代码
        Customer c = new Customer();
        c.setName("qqq");
        c.setAge(new Long(11));
        c.setSex(new Long(0));
        
        System.out.println("qmy3 ==== 02");
        // 保存客户
        session.save(c);
        // 提交事务
        tr.commit();
        // 释放资源
        session.close();
        factory.close();
        
        System.out.println("qmy3 ==== 099");
    }
}
