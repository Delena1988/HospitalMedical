package cn.joinhealth;

import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.hospmedical.api.HospitalMedicalService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linjian
 * 16/11/2.
 */
public class HospitalServiceTest {
    ApplicationContext applicationContext = null;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("spring/spring-context.xml");
    }

    @Test
    public void testInhospRecord(){
        HospitalMedicalService service = applicationContext.getBean("hospitalMedicalService",HospitalMedicalService.class);
        System.out.println(service.getInhospRecord(new RequestMsg()).getBody());
    }

    @Test
    public void testVisitInfo(){
        HospitalMedicalService service = applicationContext.getBean("hospitalMedicalService", HospitalMedicalService.class);
        System.out.println(service.getVisitInfo(new RequestMsg()).getBody());
    }
}
