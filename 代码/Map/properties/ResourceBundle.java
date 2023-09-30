package Map;

import java.util.ResourceBundle;

public class TestRsourceBoundle {
    public static void main(String[] args) {
        //只写文件名，不写扩展名，能与properties实现相同的功能
        ResourceBundle bundle=ResourceBundle.getBundle("Map/config/user");
        String username = bundle.getString("username");
        System.out.println("username = " + username);
        String password = bundle.getString("password");
        System.out.println("password = " + password);
    }
}
