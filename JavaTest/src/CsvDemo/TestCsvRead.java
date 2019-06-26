/*
package CsvDemo;

import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class TestCsvRead {
    public static void main(String[] args) {
        File csv = new File("E:\\Work\\cluser_out.2018-11-30.log");  // CSV文件路径
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(csv));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        String line = "";
        try {
            //List<String> allString = new ArrayList<>();
            while ((line = br.readLine()) != null)  //读取到的内容给line变量
            {
                System.out.println(line);
                //allString.add(line);
            }
            // System.out.println("csv表格中所有行数："+allString.size());
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        // 声明Connection对象
        Connection conn;
        String sql = "insert into tel_test(tel)value(?)";
        String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://192.168.0.10:3306/csvtomysql?useUnicode=true&amp;characterEncoding=utf8";
        // MySQL配置时的用户名
        String user = "root";
        // MySQL配置时的密码
        String password = "123";


    }
}
*/
