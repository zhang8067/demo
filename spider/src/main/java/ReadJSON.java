
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 * @Author zhangzhen
 * @Date 2020/12/15 13:40
 **/
public class ReadJSON {

    /**
     * Title:
     * Project: 读取TXT文档中json数据
     *
     * @author YuanPeng
     */

        public static void main(String[] args) {
            // 迭代文件下所有文件及文件夹下txt文件可参照此方法
            // traverseFolder("D:\\studentFile");

            // 读取单个txt文件
            File file = new File("C:\\Users\\80673\\Desktop\\text");
            File[] files = file.listFiles();
            for (File f :files){
                if(f.isFile()){
                    // System.out.println("文件目录为："+f);
                    readStudentTxt(f);
                }
            }
        }

        /**
         * 迭代文件夹下所有文件
         * @param path 总文件路径
         */
        public static void traverseFolder(String path) {
            File files = new File(path);
            if (files.exists()) {
                File[] listFiles = files.listFiles();
                if (null == listFiles || listFiles.length == 0) {
                    System.out.println("文件夹是空的!");
                } else {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            traverseFolder(file.getAbsolutePath());
                        } else {
                            if(file.isFile()){
                                readStudentTxt(file);
                            }
                        }
                    }
                }
            } else {
                System.out.println("文件不存在!");
            }
        }

        /**
         *  *********  读取文本方法  *********
         * @param file 读取传递过来的文件
         */
        public static void readStudentTxt(File file) {
            try {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
                BufferedReader br = new BufferedReader(isr);
                StringBuffer resposeBuffer = new StringBuffer("");
                String lineTxt = null;
                while ((lineTxt = br.readLine()) != null) {
                    //lineTxt = new String(lineTxt.getBytes(), "utf-8");
                    JSONObject object = new JSONObject(lineTxt);
                    String schoolClassId = object.getString("schoolClassId");
                    System.out.println(schoolClassId+" 下所有的学生的分别是：");
                    JSONArray student = object.getJSONArray("student");
                    for(int i = 0; i< student.length() ; i++) {
                        JSONObject object1 = student.getJSONObject(i);
                        String studentId = object1.getString("studentId");
                        String studentName = object1.getString("studentName");
                        System.out.println("学生的ID为："+studentId+"；学生的姓名为："+studentName);
                    }
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
