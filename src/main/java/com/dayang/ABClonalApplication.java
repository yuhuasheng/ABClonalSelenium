package com.dayang;

import com.dayang.service.ABClonalService;
import com.dayang.utils.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class ABClonalApplication {

    public static void main(String[] args) {
        log.info("SpringBoot开始加载");
        SpringApplication.run(ABClonalApplication.class);
        ApplicationContext context = SpringUtil.getApplicationContext();
        ABClonalService abClonalService = context.getBean(ABClonalService.class);
        abClonalService.getABClonalProduct();
    }
}
