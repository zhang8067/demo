package demo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;


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


        public static void main(String[] args) {
            String filePath = "C:\\Users\\80673\\Desktop\\youtubujson.txt";
            String s = readTxt(filePath);
            JSONObject jsonObject = JSON.parseObject(s);


            String contents = jsonObject.get("contents").toString();
            JSONObject jsonObject1 = JSON.parseObject(contents);


            String twoCBRR = jsonObject1.get("twoColumnBrowseResultsRenderer").toString();
            JSONObject jsonObject2 = JSON.parseObject(twoCBRR);


            JSONArray tabs = jsonObject2.getJSONArray("tabs");
            String tabRenderer = tabs.getJSONObject(1).get("tabRenderer").toString();

            JSONObject jsonObject3 = JSON.parseObject(tabRenderer);



            String content = jsonObject3.get("content").toString();
            JSONObject jsonObject4 = JSON.parseObject(content);


            String sectionListRenderer = jsonObject4.get("sectionListRenderer").toString();
            JSONObject jsonObject5 = JSON.parseObject(sectionListRenderer);


            JSONArray contents1 = jsonObject5.getJSONArray("contents");
            String itemSectionRenderer = contents1.getJSONObject(0).get("itemSectionRenderer").toString();


            JSONObject jsonObject6 = JSON.parseObject(itemSectionRenderer);
            String contents2 = jsonObject6.get("contents").toString();


            JSONArray parseArray = JSONArray.parseArray(contents2);
            String gridRenderer = parseArray.getJSONObject(0).get("gridRenderer").toString();


            JSONObject jsonObject7 = JSON.parseObject(gridRenderer);
            JSONArray items = jsonObject7.getJSONArray("items");


            for (int i = 0; i < items.size(); i++) {
                String gridVideoRenderer = items.getJSONObject(i).getJSONObject("gridVideoRenderer").toString();
                //System.out.println(gridVideoRenderer);
                JSONObject jsonObject8 = JSON.parseObject(gridVideoRenderer);
                String videoId = jsonObject8.get("videoId").toString();
                System.out.println("第" + i +"个  videoId: " + videoId );
            }



        }

    }





