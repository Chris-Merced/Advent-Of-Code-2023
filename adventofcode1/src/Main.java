// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File sample1 = new File("sample.txt");
        FileInputStream reader = new FileInputStream(sample1);
        Scanner scnr = new Scanner(reader);

        int redTotal = 100;
        int greenTotal = 100;
        int blueTotal = 100;
        int gameID = 0;
        String[] strList;
        String [] SetInstance;
        String gameInstance = "";
        int possibleGames = 0;
        int totalPower = 0;

        while (scnr.hasNextLine()) {
            gameID += 1;

            gameInstance = scnr.nextLine();

            int i = 0;
            strList = gameInstance.split(":");
            String strListSplitter = strList[1];
            SetInstance = strListSplitter.split(";");
            ArrayList<String> cubeInstance = new ArrayList<String>();
            String[] tempVal;
            for (i = 0; i < SetInstance.length; i++) {
                tempVal = SetInstance[i].split(",");

                for (int j = 0; j < tempVal.length; j++) {

                    cubeInstance.add(tempVal[j].strip());
                }

            }

            int tempBlue = 0;
            int upperBlue = 0;
            int tempRed = 0;
            int upperRed = 0;
            int tempGreen = 0;
            int upperGreen =0;

            for (i = 0; i < cubeInstance.size(); i++) {
                if (cubeInstance.get(i).contains("blue")) {
                    try {
                        int firstNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));
                        int secondNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(1)));
                        int wholeNumber = (firstNumber * 10) + secondNumber;

                        tempBlue = wholeNumber;
                        if (tempBlue>upperBlue){
                            upperBlue = tempBlue;
                        }

                    } catch (Exception e) {
                        int wholeNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));

                        tempBlue = wholeNumber;
                        if (tempBlue>upperBlue){
                            upperBlue = tempBlue;
                        }


                    }

                    System.out.println(upperBlue);



                }

            }
            if (tempBlue>blueTotal){
                continue;
            }

            for (i = 0; i < cubeInstance.size(); i++) {
                if (cubeInstance.get(i).contains("green")) {
                    try {
                        int firstNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));
                        int secondNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(1)));
                        int wholeNumber = (firstNumber * 10) + secondNumber;

                        tempGreen = wholeNumber;
                    } catch (Exception e) {
                        int wholeNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));

                        tempGreen = wholeNumber;
                    }


                    if (tempGreen>upperGreen){
                        upperGreen = tempGreen;
                    }

                }

            }
            if (tempGreen>greenTotal){
                continue;
            }
            for (i = 0; i < cubeInstance.size(); i++) {
                if (cubeInstance.get(i).contains("red")) {
                    try {
                        int firstNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));
                        int secondNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(1)));
                        int wholeNumber = (firstNumber * 10) + secondNumber;

                        tempRed = wholeNumber;
                    } catch (Exception e) {
                        int wholeNumber = Integer.parseInt(String.valueOf(cubeInstance.get(i).charAt(0)));

                        tempRed = wholeNumber;
                    }
                }

                if (tempRed>upperRed){
                    upperRed = tempRed;
                }

            }
            if (tempRed>redTotal){
                continue;
            }
            int gamePower = upperBlue*upperGreen*upperRed;
            possibleGames += gameID;
            totalPower += gamePower;

            System.out.println(totalPower);













        }








        }














    }

