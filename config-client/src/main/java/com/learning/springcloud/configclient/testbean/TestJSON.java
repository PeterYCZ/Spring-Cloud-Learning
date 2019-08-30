package com.learning.springcloud.configclient.testbean;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TestJSON {

    @Value("${neo.devicelist:error}")
    private String Devicelist;

    @Scheduled(cron = "0/20 * * * * ?")
    public void task(){
        JSONObject.
    }

}
