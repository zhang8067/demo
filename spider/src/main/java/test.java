import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.EnumerationUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/**
 * @Author zhangzhen
 * @Date 2020/12/16 9:33
 **/
public class test {

        public static String readTxt(String filePath) {
            try {
                File file = new File(filePath);
                if(file.isFile() && file.exists()) {
                    InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                    BufferedReader br = new BufferedReader(isr);
                    String lineTxt = null;
                    while ((lineTxt = br.readLine()) != null) {
                        return lineTxt;
                    }
                    br.close();
                } else {
                    System.out.println("文件不存在!");
                }
            } catch (Exception e) {
                System.out.println("文件读取错误!");
            }
            return null;
        }

        public static String  readJson(String JsonPara,int i){

                String videoId = JSON.parseObject(
                        JSON.parseObject(
                                JSONArray.parseArray(
                                        JSON.parseObject(
                                                JSON.parseObject(
                                                        JSON.parseObject(
                                                                JSON.parseObject(
                                                                        JSON.parseObject(
                                                                                JSON.parseObject(
                                                                                        JSON.parseObject(JsonPara)
                                                                                        .get("contents").toString())
                                                                                        .get("twoColumnBrowseResultsRenderer").toString())
                                                                                .getJSONArray("tabs").getJSONObject(1).get("tabRenderer").toString())
                                                                        .get("content").toString())
                                                                .get("sectionListRenderer").toString())
                                                        .getJSONArray("contents").getJSONObject(0).get("itemSectionRenderer").toString())
                                                .get("contents").toString()).getJSONObject(0).get("gridRenderer").toString())
                                .getJSONArray("items").getJSONObject(i).getJSONObject("gridVideoRenderer").toString())
                        .get("videoId").toString();

                return videoId;

        }

        public static void main(String[] args) {

            String filePath = "C:\\Users\\80673\\Desktop\\youtubujson.txt";
            String JSONString = readTxt(filePath);


            for (int i = 0; i <10; i++) {
                System.out.println(readJson(JSONString,i)) ;
            }



        }

    }





