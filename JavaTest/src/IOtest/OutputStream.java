package IOtest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* OutputSteam 所有输出字节流的基类 抽象类
* FilterOutputStream 向文件输出数据的输出字节流
* BufferedOutputStream 缓冲输出字节流 目的是为了提高写数据的效率
* 内部也是维护一个8kb的字节数组而已
*
* BufferedOutputStream注意细节
* 1、使用BufferedOutputStream写数据的时候，它的write方法是先把数据写到它内部维护的字节数组中
* 2、使用BufferedOutputStream写数据的时候，它的write方法是先吧数据写到它内部维护的字节数组中，如果需要把数据真正的写到硬盘上面，
* 需要调用flush方法或者close方法、或者内部维护的字节数组已经填满数据的时候。
* */
public class OutputStream {
    public static void main(String[] args) throws IOException {
        //找到目标文件
        File file = new File("C:\\a.txt");
        //建立数据输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //建立缓冲输出字节流对象
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //把数据写出
        bufferedOutputStream.write("hello,I will write".getBytes());
        //把缓冲数组中内部的数据写到硬盘上面
        bufferedOutputStream.flush();
        //bufferedOutputStream.close();

    }
}
