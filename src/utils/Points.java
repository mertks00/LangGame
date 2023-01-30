package utils;

public class Points {
	
    public static int point = 1;
    public static int false_point = 1;

    public static void addPoint() {

        Frames.dogru.setText("DOĞRU: " + point++);


    }

    public static void removePoint() {

        Frames.yanlis.setText("YANLIŞ: " + false_point++);


    }

}
