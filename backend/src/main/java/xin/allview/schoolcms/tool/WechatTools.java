package xin.allview.schoolcms.tool;

import com.jfinal.kit.HttpKit;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.util.Map;

/**
 * HttpTools
 * Created by tudou on 17/3/23.
 */
public class WechatTools {
    private static final String HEAD_ACCESSTOKEN_WEB = "https://api.weixin.qq.com/sns/oauth2/access_token?grant_type=authorization_code";

    public static String queryOpenId(String AppID, String AppSecret, String weixinCode) {
        System.out.println("获取微信openid的方法执行了");
        String getAccessTokenUrlWeb =
                HEAD_ACCESSTOKEN_WEB + "&appid=" + AppID + "&secret=" + AppSecret + "&code=" + weixinCode;
        String data = HttpKit.get(getAccessTokenUrlWeb);
        return data;
    }
}
