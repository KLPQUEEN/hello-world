package xin.allview.schoolcms.tool;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 友空间工具类
 * Created by tudou on 17/3/22.
 */
public class UpesnTools extends HttpTools {

    private static final String baseUrl = "https://openapi.upesn.com/";

    /**
     * 获取access_token
     */
    public String getAcessToken(String appid, String secret) throws Exception {
        String url = baseUrl + "token";
        Map<String, String> data = new HashMap<String, String>();
        data.put("appid", appid);
        data.put("secret", secret);
        JSONObject jasonObject = JSONObject.parseObject(get(url, data));
        return jasonObject.getJSONObject("data").getString("access_token");
    }
    /**
     * 获取 友空间手机版的返回参数
     */
    public String getJSAPI(String appid,String secret) throws  Exception{
        try {
            String url = baseUrl + "get_jsapi_ticket?access_token="+getAcessToken(appid,secret);
            Map<String,String> data=new HashMap<String,String>();
            return (get(url,data));
        }catch (Exception e){
            e.printStackTrace();
            return  "";
        }
    }
    /**
     * 企业自建应用调用免登
     */
    /**
     * ISV应用调用免登
     */
    public String getUserInfo(String appid, String secret, String code) {
        try {
            String url =
                    baseUrl + "certified/userInfo/" + code + "?access_token=" + getAcessToken(appid, secret);
            Map<String, String> data = new HashMap<String, String>();
            return (get(url, data));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }



}
