import entity.RoleEntity;
import mapper.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {

    //TODO A3 这里通过4大组件来实现一个简单的查询
    @Test
    public void testSqlSessionFactoryBuilder(){
        //1.先获得sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        String is ="mybatis-config.xml";

        try {
            InputStream inputStream = Resources.getResourceAsStream(is);
            //2.sqlSessionFactoryBuilder读取主配置文件创建sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            //3.sqlSessionFactory通过openSession方法获得一个sqlSession对象。sqlSession对象已经可以通过老方式来对数据库进行操作了
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //4.但是这里我们使用Mapper的形式。通过RoleMapper接口获得一个RoleMapper的代理对象
            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
            //5.代理对象执行方法
            RoleEntity roleEntity = mapper.getRoleById(1);
            System.out.println(roleEntity);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
