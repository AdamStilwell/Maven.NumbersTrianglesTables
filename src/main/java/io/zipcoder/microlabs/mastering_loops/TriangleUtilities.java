package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<(numberOfRows-1);i++){
            for(int j = 0; j< (i +1); j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= numberOfStars; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<4;i++){
            for(int j = 0; j< (i +1); j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<9;i++){
            for(int j = 0; j< (i +1); j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
