package com.hendisantika.springbootasynctask.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-async-task
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-06
 * Time: 08:16
 * To change this template use File | Settings | File Templates.
 */
@EnableAsync
@Component
public class AsyncWorker {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncWorker.class);

    @Async
    public void execute() {
        LOGGER.info(" AsyncWorker: current thread [" + Thread.currentThread().getName() + "]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            LOGGER.info(" sleeping thread interrupted ");
        }
        LOGGER.info(" AsyncWorker: completed [" + Thread.currentThread().getName() + "]");
    }
}