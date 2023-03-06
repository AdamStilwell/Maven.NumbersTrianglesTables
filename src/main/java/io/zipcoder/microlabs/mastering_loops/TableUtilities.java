package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder stringBuilder = new StringBuilder();
        String length;
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j<= 5; j++){
                length = String.valueOf(j*i);
                if(j % 5 ==0) {
                    if(length.length() ==2) {
                    stringBuilder.append(" ");
                    stringBuilder.append(j * i);
                    stringBuilder.append(" |");
                    stringBuilder.append("\n");
                    }
                    else{
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }
                } else{
                    if(length.length() ==2) {
                        stringBuilder.append(" ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                    else{
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder stringBuilder = new StringBuilder();
        String length;
        for (int i = 1; i <= 10; i++){
            for(int j = 1; j<= 10; j++){
                length = String.valueOf(j*i);
                if(j % 10 ==0) {
                    if(length.length() ==2) {
                        stringBuilder.append(" ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }
                    else if(length.length() == 1){
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }else{
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }
                } else{
                    if(length.length() ==2) {
                        stringBuilder.append(" ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                    else if(length.length()==1){
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                    else{
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder stringBuilder = new StringBuilder();
        String length;
        for (int i = 1; i <= 20; i++){
            for(int j = 1; j<= 20; j++){
                length = String.valueOf(j*i);
                if(j % 20 ==0) {
                    if(length.length() ==2) {
                        stringBuilder.append(" ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }
                    else if(length.length() == 1){
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }else{
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                        stringBuilder.append("\n");
                    }
                } else{
                    if(length.length() ==2) {
                        stringBuilder.append(" ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                    else if(length.length()==1){
                        stringBuilder.append("  ");
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                    else{
                        stringBuilder.append(j * i);
                        stringBuilder.append(" |");
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
