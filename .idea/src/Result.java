public class Result {
    public static int entryTime(String s, String keypad) {
        char[] pass = s.toCharArray();
        char[] keys = keypad.toCharArray();

//        show pass
//        System.out.print("Password is:");
//        for (int i = 0; i <pass.length; i++){
//            System.out.print(pass[i]);
//        }

//        show keypad
//        System.out.println("\nKeypad is:");
//        for (int i = 0; i <keys.length; i++){
//            System.out.print("Key"+i+"="+keys[i]+"\t");
//        }

        int keyPosition = 0;

        char[][] keyboard = new char[3][3];

        //populate keypad

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyboard[i][j] = keys[keyPosition];
                keyPosition++;
            }

        }

        //show keypad
        System.out.println("\nKeypad from CharArray is:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(keyboard[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int time = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int passPosition = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (passPosition == pass.length) {
                    break;
                }
                if ((keyboard[i][j] == pass[passPosition]) && (passPosition < pass.length)) {
                    if (passPosition == 0) {
                        passPosition++;
                    } else if ((passPosition != 0) && (keyboard[i][j] != pass[passPosition - 1])) {
                        if (i == currentRow) {
                            if ((j == currentColumn + 1) || (j == currentColumn - 1)) {
                                passPosition++;
                                time += 1;
                            }
                        } else if (j == currentRow) {
                            if ((i == currentColumn + 1) || (i == currentColumn - 1)) {
                                passPosition++;
                                time += 1;
                            }
                        } else if (((i == currentRow + 1) && (j == currentColumn + 1)) || ((i == currentRow - 1) && (j == currentColumn - 1)) || ((i == currentRow + 1) && (j == currentColumn - 1)) || ((i == currentRow - 1) && (j == currentColumn + 1))) {
                            time += 1;
                            passPosition++;
                        } else time += 2;
                    }
                    currentRow = i;
                    currentColumn = j;

                    i = 0;
                    j = 0;
//                    passPosition++;
                }

            }

        }

        return time;
    }
}
