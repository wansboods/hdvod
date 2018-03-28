import com.bevixtech.hdvod.dao.FootbathResourceDao;
import com.bevixtech.hdvod.entity.FootbathResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestFootbathResourceDaoTest {

    @Resource
    private FootbathResourceDao footbathResourceDao;

    @Test
    public void select_all(){
        System.out.print( footbathResourceDao.selectAllFootbathResource() );
    }

}
