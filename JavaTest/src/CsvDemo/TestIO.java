package CsvDemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

public class TestIO {
    public static void main(String[] args) {
        File file = new File("E:\\Work\\log2000.log");  // log文件路径
        BufferedReader br = null;
        //统计行数
        try{
            if(file.exists()){
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int linenumber = 0;
                String lineStr = "";
                while ((lineStr = lnr.readLine()) != null){
                    if(lineStr.indexOf("PostEvent Start log") != -1){
                        int farst = lineStr.indexOf("{");
                        int last = lineStr.lastIndexOf("}");
                        String jsonStr = lineStr.substring(farst,last + 1);
                        JSONObject jsonObj = JSON.parseObject(jsonStr);
                        System.out.println(jsonObj.get("course_id"));
                        System.out.println(jsonObj.get("page_id"));

                        //打印所有
                        System.out.println(lineStr);
                    }
                    linenumber++;
                }
                System.out.println("Total number of lines : " + linenumber);
                lnr.close();
            }else{
                System.out.println("File does not exists!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
