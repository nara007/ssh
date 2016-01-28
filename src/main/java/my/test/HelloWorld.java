package my.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by nara007 on 16/1/27.
 */
public class HelloWorld extends ActionSupport{

    public static final String MESSAGE = "Struts is up and running ...";

    public String execute() throws Exception {
        setMessage(MESSAGE);
        return SUCCESS;
    }

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
