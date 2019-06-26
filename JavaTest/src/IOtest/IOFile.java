package IOtest;
/*
* IO流（Input,Output）主要作用解决设备与设备之间的数据传输问题。
*
* File(String pathname)  制定文件或者文件夹的路径创建一个File文件。通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。
* File(File parent, String child)  从父抽象路径名和子路径名字符串创建新的File实例。
* File(String parent, String child)  从父路径名字符串和子路径名字符串创建新的 File实例。
* File(URI uri)  通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
*
* */

import java.io.File;

public class IOFile {
    public static void main(String[] args) {

        //方法一
        File file = new File("C:\\a.txt");
        System.out.println("存在吗？"+file.exists()); //判断时候存在
        //方法二
        File parentFlie = new File("C:\\");
        File file1 = new File(parentFlie,"a.txt");
        System.out.println("存在吗？"+file1.exists()); //判断时候存在
        //方法三
        File file2 = new File("C://","a.txt");
        System.out.println("存在吗？"+file2.exists()); //判断时候存在

        System.out.println("路径"+parentFlie);
    }

}
