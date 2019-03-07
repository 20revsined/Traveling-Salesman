import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HomervilleDataMain2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String question = "";
        String file = "";
        int input = 0;
        int k = 0;
        double TotalDistance = 0;

        String line = null;
        double TotalPackages = 0;
        double TotalTime = 0;
        int j = 0;
        int workers = 4;
        int LisaPackages = 0;

//        int array[] = new int[4630];
        List<Position> array = new <Position>ArrayList();
        double time = 0;
        CityOfHomerville homerville = new CityOfHomerville();
        Trucks t = new Trucks();
        while (true) {

            System.out.println("What day of the 10 day cycle would you like to enter?");
            input = Integer.parseInt(sc.nextLine());
            String FileName = "cycle" + input + ".txt";

            Scanner dylan = new Scanner(new File(FileName));

            dylan.nextLine();
//file = dylan.next();
            int NumPackages = Integer.parseInt(dylan.nextLine());

            String[] data = new String[3];
            int dylan2 = 0;
            while (dylan.hasNext()) {
                String dylan1 = dylan.nextLine();
// System.out.println(i);
                if (dylan1.equals("Bart Complex")) {

                    dylan2 = Integer.parseInt(dylan.nextLine());
//System.out.println(i);
//System.out.println(dylan2);
                    for (j = 0; j < dylan2; j++) {
//    i++;
                        array.add(homerville.getBart());
//homerville.getBartX();
//homerville.getBartY();
                    }
                    dylan.nextLine();
                    LisaPackages = Integer.parseInt(dylan.nextLine());
//int dylan3 = Integer.parseInt(dylan.nextLine());
//dylan.nextLine();
                    for (j = 0; j < LisaPackages; j++) {
                        array.add(homerville.getLisa());
//    dylan.close();
                        break;
                    }
                } else {
                    data = dylan1.split(",");

                    for (k = 0; k < 3; k++) {
                        if (k < 0 || k >= 3) {
                            System.out.println("The size of k is too large!");
                        } else {
                            System.out.println(data[k]);
                        }
                    }

                    data[0] = data[0].substring(0, data[0].length() - 1);
                    data[1] = data[1].substring(0, data[1].length() - 1);
                    array.add(homerville.WhereAmI(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2]));
                }
//try {
//    dylan = new Scanner(new File(file));
//
// while (dylan.hasNext()) {
// 
//  file = dylan.nextLine();
//
// System.out.println(file);
// }
// dylan.close();
//}
//catch (IOException e) {
//    }
//
//System.out.println(file);
//
//    while (dylan.hasNextLine()) {
//    
//    System.out.println(array[i]);
//}
//dylan.close();
//System.out.println(array[k]);
            }
//BartComplex bc = new BartComplex();
//LisaComplex lc = new LisaComplex();
//
//System.out.println(bc.Distance(lc.getX(), lc.getY()));
//System.out.println(lc.Distance(bc.getX(), bc.getY()));

            System.out.println("You have delivered " + NumPackages + " packages");
            TotalPackages += NumPackages;

            NearestNeighborAlgorithm nn = new NearestNeighborAlgorithm(array);
            nn.Information();
            System.out.println("The truck has traveled " + nn.DistanceRoute() + " miles in Day " + input);

            TotalDistance += nn.DistanceRoute();

            time = ((nn.DistanceRoute() * 0.3) / 3600f) + (((15 * (NumPackages - LisaPackages - dylan2)) + (7.5 * LisaPackages + 7.5 * dylan2)) / 3600);
            System.out.println("It took the truck " + time + " hours to deliver all of the packages on Day " + input);
            TotalTime += time;

//                
//                else if(input == 2) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 290 - 421) + (100 * 15 + 100 * 15 + 90 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 100 * 15 + 21 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 3) {
//                     time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 120 - 444) + (100 * 15 + 20 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 100 * 15 + 44 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 4) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 120 - 444) + (100 * 15 + 20 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 100 * 15 + 44 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 5) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 110 - 221) + (100 * 15 + 10 * 15) + (100 * 15 + 100 * 15 + 21 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 6) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 300 - 499) + (100 * 15 + 100 * 15 + 100 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 100 * 15 + 99 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 7) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 299 - 399) + (100 * 15 + 100 * 15 + 99 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 99 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 8) {
//                   time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 190 - 121) + (100 * 15 + 90 * 15) + (100 * 15 + 21 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 9) {
//                    time = ((nn.DistanceRoute() / 100 * 3) / 3600) + (((15 * NumPackages - 300 - 500) + (100 * 15 + 100 * 15 + 100 * 15) + (100 * 15 + 100 * 15 + 100 * 15 + 100 * 15 + 100 * 15)) / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }
//                
//                else if(input == 10) {
//                     time = ((nn.DistanceRoute() * 5000) / 100 * 3 / 3600) + (4 * NumPackages / 3600);
//                  System.out.println(time);
//                  TotalTime += time;
//                }

//                int count = 0;
//		boolean b = false;
//		for (i = 0; i < array.length; i++) {
//		for (j = 0; j < i; j++) {
//			if (array[i].equals(array[j])) {
//				b = true;
//			}
//		}
//			if (array[i] != null) {
//				count ++;
//			}
//		}
//		System.out.println(Integer.toString(count));
//		if (b) {
//			System.out.println("bad");
//		} else {
//			System.out.println("good");
//		}
//                System.out.println(t.getTT() + t.getDT());
            System.out.println("Would you like to enter another day's data? If so, enter a new day for the cycle data. Otherwise, type 'no'.");
            question = sc.nextLine();

            if (question.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
        
                System.out.println("The total delivery and travel times for all 10 days is " + TotalTime + " hours");
        System.out.println(TotalPackages + " packages have been delivered for all 10 days.");
        System.out.println("The truck has traveled a total distance of " + TotalDistance + " miles");

        String input2 = "";

        final double budget = 2000000;
        int NumWorkers = 0;
        double distance = 0;
        int NumTrucks = 0;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome to the IPS Servers: Finances Division! What would you like to enter?");

        while (true) {
            input2 = sc.next();

            if (input2.equals("total_cost")) {
                System.out.println("Enter the number of workers, distance traveled (in miles), and number of trucks you used for all 10 days.");
                NumWorkers = sc.nextInt();
                distance = sc.nextDouble();
                NumTrucks = sc.nextInt();
            } else if (input2.equals("done")) {
                break;
            }

        }
        double salary = NumWorkers * 960;
        double GasPrice = distance * 5;

//       System.out.println("The salary of " + NumWorkers + " workers is $" + NumWorkers * 840);
//       System.out.println("The cost of gas for " + distance + " miles is $" + distance * 5);
//       System.out.println("The amount of money remaining in the account is $" + (budget - NumWorkers * 840));
//       System.out.println("The one day's cost is $" + (100000 + distance * 5 + salary));
        System.out.println("Did you buy or rent your trucks?");
        input2 = sc.next();
        if (input2.equals("buy")) {
            double BuyTruckPrice = 100000 * NumTrucks;
            double ServiceFee = Math.floor(distance / 100) * 1000 * NumTrucks;
            System.out.println("The 10 day cost for the data you entered is " + formatter.format(GasPrice + salary + BuyTruckPrice + ServiceFee));
        } else {
            System.out.println("How many total days did you rent your trucks?");
            int NumDays = sc.nextInt();
            double RentTruckPrice = 15000 * NumTrucks * NumDays;
            System.out.println("The 10 day cost for the data you entered is " + formatter.format(GasPrice + salary + RentTruckPrice));
        }
    }
}

//Sources: https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java , http://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html , https://www.youtube.com/watch?v=WmMCUSMQuag , 
//https://stackoverflow.com/questions/18888476/how-to-store-input-values-in-an-array-by-using-scanner-in-java , https://www.quora.com/How-do-I-save-user-input-inside-an-array-in-Java , https://javarevisited.blogspot.com/2016/07/how-to-read-text-file-using-scanner-in-java-example-tutorial.html ,
//https://stackoverflow.com/questions/20162145/string-index-out-of-bounds-exception-java , https://stackoverflow.com/questions/2312756/how-to-read-a-specific-line-using-the-specific-line-number-from-a-file-in-java , http://xplore-java.blogspot.com/ ,
//https://bukkit.org/threads/how-to-fix-java-lang-arrayindexoutofboundsexception-1.111114/ , https://coderanch.com/t/484308/java/java-lang-ArrayIndexOutOfBoundsException , https://stackoverflow.com/questions/16467325/how-to-handle-arrayindexoutofboundsexception , https://stackoverflow.com/questions/2379221/java-currency-number-format
