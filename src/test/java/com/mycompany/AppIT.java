package com.mycompany;

import com.mycompany.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertTrue;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = com.mycompany.ContextConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppIT {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testSpring(){
        Greeter greeter = context.getBean(Greeter.class);

        assertTrue(greeter.greet().startsWith("Hello "));
    }
}
