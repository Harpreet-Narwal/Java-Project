import java.util.HashMap;

public class IDandPassword {
    
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IDandPassword(){
        logininfo.put("Harpreet", "1111");
        logininfo.put("Abhisth", "2222");
        logininfo.put("Rudrakshi", "3333");
        logininfo.put("Rahul", "4444");

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
