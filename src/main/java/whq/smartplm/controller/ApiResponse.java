package whq.smartplm.controller;

import org.springframework.http.HttpStatus;

public class ApiResponse<T> {

    private int status = -1;
    private String message = "Fail";
    private T data;

    public void setSuccess(T data){
        this.status = 0;
        this.message = "Success";
        this.data = data;
    }

    public void setMessageAndData(String message, T data){
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatusOK(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
