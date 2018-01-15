package org.bu.cloud.ms.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/cs")
public class ConsumerController {

    @Autowired
    private Calculator calculator;

    @RequestMapping(value = "/s", method = RequestMethod.GET)
    public String sum() {
        return calculator.sum();
    }

    @RequestMapping(value = "/p", method = RequestMethod.GET)
    public String ptt() {
        return calculator.product();
    }


}