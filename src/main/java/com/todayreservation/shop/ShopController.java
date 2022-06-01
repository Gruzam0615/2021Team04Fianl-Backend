package com.todayreservation.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todayreservation.util.SuccessResponse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@RestController
public class ShopController {
    private static final Logger logger = LogManager.getLogger(ShopController.class);
    private ShopReopsitory shopReopsitory;

    @GetMapping(value = "/test01")
    public String Test01() {
        logger.info("Requested /test01");
        return "Test01";
    }
    @GetMapping(value = "/test02")
    public String Test02(@RequestParam("test02") String test02) {
        logger.info("Requested /test02");
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
            String answer = params.get("title");
            // return answer.getClass().getName();
            return answer;
        } 
        else {
            return "에러발생...";
        }
    }

    @GetMapping(value = "/AddShop")
    public SuccessResponse AddShop(HttpServletRequest req, HttpServletResponse res, Shop params) {
        String ip = req.getHeader("X-Forwarded-For");
        if(ip == null) { ip = req.getRemoteAddr(); }
        logger.info("> " + ip + " request /addShop");
        
        int statusCode = res.getStatus();
        LocalDateTime responsedTime = LocalDateTime.now();
        // shopReopsitory.save(query);
        SuccessResponse answer = new SuccessResponse(statusCode, responsedTime, params);
        return answer;
    }    
    // @GetMapping(value = "/test04")
    // public SuccessResponse Test04(HttpServletRequest req, HttpServletResponse res, Shop params) {
    //     String ip = req.getHeader("X-Forwarded-For");
    //     if(ip == null) { ip = req.getRemoteAddr(); }
    //     logger.info("> " + ip + " request Test04");
        
    //     int statusCode = res.getStatus();
    //     LocalDateTime responsedTime = LocalDateTime.now();
    //     SuccessResponse answer = new SuccessResponse(statusCode, responsedTime, params);
    //     // Shop answer = params;
    //     return answer;
    // }

    // @GetMapping(value = "/shop")
    // public Object getShopList(@RequestParam(value = "title", defaultValue = "") String title, HttpServletRequest request, HttpServletResponse response) {
    //     ResponseEntity result = null;
    //     LocalDateTime t = LocalDateTime.now();
    //     // MissingServletRequestParameterException issue
    //     String paramTitle = request.getParameter("title");
        
    //     if(paramTitle == null) {
    //         logger.error("400 Bad Request");
    //         ErrorResponse answer = new ErrorResponse(t, StatusCode.ERROR);
    //         return answer;
    //     }

    //     if(title.isEmpty()) {
    //         logger.error("406 ");
    //         ErrorResponse answer = new ErrorResponse(t, StatusCode.BLANK_REQUEST);
    //         result = ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(answer);
    //     }
    //     else {
    //         logger.info("200 Processing...");
    //         Shop e = new Shop(title);    
    //         ArrayList<Shop> s = new ArrayList<>();
    //         s.add(e);
    //         ShopResponse answer = new ShopResponse(t, s);
    //         result = ResponseEntity.status(HttpStatus.OK).body(answer);
    //     }
       
    //     return result;
        
            
    // }



}