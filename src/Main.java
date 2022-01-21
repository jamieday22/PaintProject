import java.net.StandardSocketOptions;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quoteAgain = true;
        do {


            //float randomNumberGenerator = (float)(Math.random() * 20);
            float roomHeightWall1;
            float roomWidthWall1;
            float ceilingWidth;
            float ceilingHeight;
            float doorHeight;
            float doorWidth;
            float windowHeight;
            float windowWidth;
            int numberOfCoats = 0;
            float costOfPaintPerLitre = 0;
            String thatDoesntSeemRight = (numberOfCoats >= 3) ? "Thats Good" : "Too many coats";
            double totalAreaOfCeiling = 0;
            float squareFeetPerLitre = 20;
            float paintColor[];


           // String[] colourArray = {"Red","Blue","Green","Yellow"};
          //  for (String i : colourArray) {

          //      System.out.println(i);
          //  }

            //allow user  input;
            System.out.println("What colour of paint do you want?");
            String colour = scanner.nextLine();

            String colourArray []  = new String(colour)];

            System.out.println("Enter the " + colour + " ??.");



            System.out.println("The Height of the wall ");
            roomHeightWall1 = scanner.nextFloat();

            if (roomHeightWall1 > 20) {
                System.out.println("Be realistic");
            } else {


                System.out.println("The Width of the wall ");
                roomWidthWall1 = scanner.nextFloat();

                double totalAreaOfWalls = (roomWidthWall1 * roomHeightWall1);

                System.out.println("do you want to paint the ceiling Y/y or N/n");
                String response = scanner.next();


                if (response.equals("n") || response.equals("N")) {
                    System.out.println("ok please carry on");

                } else if (response.equals("y") || response.equals("Y")) {
                    System.out.println("ok please carry on");

                    System.out.println("The width of the ceiling");
                    ceilingWidth = scanner.nextFloat();

                    System.out.println("The height of the ceiling ");
                    ceilingHeight = scanner.nextFloat();

                    totalAreaOfCeiling = (ceilingHeight * ceilingWidth);
                }


                System.out.println("The height of the door ");
                doorHeight = scanner.nextFloat();

                System.out.println("The Width of the door ");
                doorWidth = scanner.nextFloat();

                double totalAreaOfDoor = (doorHeight * doorWidth);

                System.out.println("The height of the window ");
                windowHeight = scanner.nextFloat();

                System.out.println("The Width of the window ");
                windowWidth = scanner.nextFloat();

                double totalAreaOfWindow = (windowHeight * windowWidth);

                System.out.println("number coats you want to apply ");
                numberOfCoats = scanner.nextInt();

                switch (numberOfCoats) {
                    case 1:
                        System.out.println("not enough");
                        break;
                    case 2:
                        System.out.println("Thats Good");
                        break;
                    case 3:
                        System.out.println("If you like");
                        break;
                    default:
                        System.out.println("Go back and check again");
                        System.exit(0);
                }

                System.out.println("The cost per litre ");
                costOfPaintPerLitre = scanner.nextFloat();


                double areaOfEverything = ((totalAreaOfWalls + totalAreaOfCeiling) - (totalAreaOfDoor + totalAreaOfWindow));
                double result = ((totalAreaOfWalls * numberOfCoats) / squareFeetPerLitre);
                System.out.println("The price will be " + Math.round(result * costOfPaintPerLitre) + " pounds");


            }

        }
        while (quoteAgain = false);

        System.out.println("do you want another quote y/Y n/N");
        String response = scanner.next();

        if (response.equals("n") || response.equals("N")) {
            quoteAgain = false;
            System.out.println("ok have a nice day");

        }
            else if (response.equals("y") || response.equals("Y")) {
                    quoteAgain = true;
                    System.out.println("ok have a nice day");
                }

            }
        }





