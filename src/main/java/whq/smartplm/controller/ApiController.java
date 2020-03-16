package whq.smartplm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(value = "*")
public class ApiController {

    public Logger logger;

    public void init(){
        logger = LoggerFactory.getLogger(this.getClass());
        logger.info(this.getClass()+" init.");
    }
    public ApiController(){init();}
    public void exceptionHandleing(Exception e, ApiResponse response){
        logger.error(e.getMessage());
        response.setMessage(e.getMessage());
    }


}
