import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author zhangzhen
 * @Date 2020/12/15 9:58
 **/
public class ReadEntity {
    public static void main(String[] args) {
        String message = "";
        File file = new File("C:\\Users\\80673\\Desktop\\youtubujson.txt");//目标文件地址
        try {
            FileInputStream in = new FileInputStream(file);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            message = new String(buffer, "utf-8");
        } catch (IOException e) {
        }
       // JSON.parseObject()
        youtubu m=JSON.parseObject(message,youtubu.class);
       // PrintWriter out = response.getWriter();
       // out.print(JSON.toJSON(m));
        System.out.println(JSON.toJSON(m));
       // JSON.toJSON(m).toString().replaceAll()


    }
}
