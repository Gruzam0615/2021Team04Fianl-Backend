package com.todayreservation.shop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

import com.todayreservation.util.ErrorResponse;
import com.todayreservation.util.StatusCode;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@RestController
public class ShopController {
    private static final Logger logger = LogManager.getLogger(ShopController.class);

    @GetMapping(value = "/test01")
    public String Test01() {
        logger.info("Requested /test01");
        return "Test01";
    }
    @GetMapping(value = "/test02")
    public String Test02(@RequestParam("test02") String test02) {
        if(test02.isEmpty()) { return "Input Blank Error"; }
        else {
            return test02;
        }
    }
    @GetMapping(value = "/test03")
    public String Test03(@RequestParam Map<String, String> params) {
        // if(params.size() > 1) {
        //     return "Exception";
        // }
        if(params.get("title") != null) {
            return params.get("content");
        } 
        else {
            return "Some...";
        }
    }

    @GetMapping(value = "/shop")
    public Object getShopList(@RequestParam(value = "title", defaultValue = "") String title, HttpServletRequest request, HttpServletResponse response) {
        ResponseEntity result = null;
        LocalDateTime t = LocalDateTime.now();
        // MissingServletRequestParameterException issue
        // String paramTitle = request.getParameter("title");
        // if(paramTitle == null) {
        //     logger.info("400 Bad Request...");
        //     ErrorResponse answer = new ErrorResponse(t, StatusCode.BAD_REQUEST);
        //     return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(answer);
        // }
        if(title.isEmpty()) {
            logger.error("406 title is blank...");
            ErrorResponse answer = new ErrorResponse(t, StatusCode.BLANK_REQUEST);
            result = ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(answer);
        }
        else {
            logger.info("200 Processing...");
            Shop e = new Shop(title);    
            ArrayList<Shop> s = new ArrayList<>();
            s.add(e);
            ShopResponse answer = new ShopResponse(t, s);
            result = ResponseEntity.status(HttpStatus.OK).body(answer);
        }
       
        return result;
        
            
    }



}
