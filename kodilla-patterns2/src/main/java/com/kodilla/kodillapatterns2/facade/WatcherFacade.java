package com.kodilla.kodillapatterns2.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class WatcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Start method of class " + object.getClass().getName());
     }
}
