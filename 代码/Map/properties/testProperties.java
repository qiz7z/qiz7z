package Map;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(TestProperties.class.getClassLoader()
                .getResourceAsStream("Map/config/user.properties"));
        String username = properties.getProperty("username");
        System.out.println("username = " + username);
        String password = properties.getProperty("password");
        System.out.println("password = " + password);
        //遍历可以用entryset方法
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
