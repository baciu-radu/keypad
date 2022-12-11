import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH.txt")));
//
//        String s= bufferedReader.readLine();
//
//        String keypad = bufferedReader.readLine();
//
//        int result = Result.entryTime(s,keypad);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter password:");
        String s= in.nextLine();
        System.out.println("Enter keypad:");
        String keypad = in.nextLine();

//        int[][] keyboard = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("keyboard["+i+"]["+j+"]=");
//                keyboard[i][j]=in.nextInt();
//            }
//
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("keyboard["+i+"]["+j+"]="+keyboard[i][j]);
//
//            }
//
//        }


        in.close();




        int result = Result.entryTime(s,keypad);
        System.out.println("Result is:"+result);
    }
}
