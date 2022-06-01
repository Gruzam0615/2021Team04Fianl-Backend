package com.todayreservation.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class SampleController {
    private static final Logger logger = LogManager.getLogger(SampleController.class);
    @Autowired
    private SampleRepository sampleRepository;

    @ApiOperation(value="/AddSample", notes="/AddSample")
    @GetMapping(value = "/AddSample")
    public void AddSampleTest01(Sample param) {
        logger.info("Request /SampleTest01");
        logger.info(param.getId() + " " + param.getColumn2());

        Sample query = new Sample();
        query.setId(param.getId());
        query.setColumn2(param.getColumn2());

        sampleRepository.save(query);
    }

    @GetMapping(value = "/GetAllSample")
    public Object SampleTest02(HttpServletRequest req, HttpServletResponse res) {
        logger.info("> Request /GetAllSample");
        return sampleRepository.findAll();
    }
}
