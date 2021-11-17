package me.template.restapi.services.request;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 3:46
 */
@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
	private MeterRegistry meterRegistry;

    private Counter counter;

    @PostConstruct
	public void init() {
		counter = meterRegistry.counter("api.call.count");
	}

    public void increaseRequestCount() throws Exception {
        counter.increment();
        // DB counter

    }

}