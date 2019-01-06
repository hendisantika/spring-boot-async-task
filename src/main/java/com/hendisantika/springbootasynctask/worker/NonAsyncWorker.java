package com.hendisantika.springbootasynctask.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-async-task
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-06
 * Time: 08:17
 * To change this template use File | Settings | File Templates.
 */
@Component
public class NonAsyncWorker {
    private static final Logger LOGGER = LoggerFactory.getLogger(NonAsyncWorker.class);

    public void execute() {
        LOGGER.info("NonAsyncWorker : current thread [" + Thread.currentThread().getName() + "]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            LOGGER.info(" sleeping thread interrupted ");
        }
    }
}