package xin.allview.schoolcms.controller;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.POST;
import org.junit.Before;

public class IndexController extends Controller {
    public void index(){
        renderText("hi");
    }
    @Before(POST.class)
    public void someApi(){
        renderText("abc");
    }
}
