package CsvDemo;

public class testSub {
    public static void main(String[] args) {
        String line = "2018/11/30 00:00:02 [D] 10.30.142.199|2018/11/30 00:00:02.267 [I] [activity.go:49]  PostEvent Start log:{\"course_id\":528,\"page_id\":16857,\"open_time\":1543507186,\"close_time\":1543507201,\"page_title\":\"1\",\"page_mode\":\"SRS\",\"listening_time\":7,\"recording_time\":0,\"read_score\":0,\"nativ\":0,\"acc\":0,\"fluency\":0,\"task_id\":\"283232\",\"audio_speed\":\"1.00\"}, eventId:5c000cea2781983499d61d5d, eventType:page, userId:850455";
        int farst = line.indexOf("{");
        int last = line.lastIndexOf("}");

        System.out.println(line.substring(farst,last + 1));

    }
}
