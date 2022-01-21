import java.util.Scanner;


public class Main {


    public static String [] paintColour(){


        String[] colourArray = {"Red","Blue","Green","Yellow","Black","Purple"};
        for (String i : colourArray) {

            System.out.println(i);

        };

        return colourArray;
    }

    public static double totalAreaOfWalls(){
        Scanner scanner = new Scanner(System.in);

        float roomHeightWall1 =0 ;
        float roomWidthWall1 =0 ;

        System.out.println("The Height of the wall ");
        roomHeightWall1 = scanner.nextFloat();

        if (roomHeightWall1 > 20) {
            System.out.println("Be realistic");

        }

        System.out.println("The Width of the wall ");
        roomWidthWall1 = scanner.nextFloat();

        double totalArea = (roomWidthWall1 * roomHeightWall1);

        return totalArea;
    }

    public static double totalAreaOfCeilings(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("do you want to paint the ceiling Y/y or N/n");
        String response = scanner.next();

        float ceilingWidth=0;
        float ceilingHeight=0;

        if (response.equals("n") || response.equals("N")) {
            System.out.println("ok please carry on");

        } else if (response.equals("y") || response.equals("Y")) {
            System.out.println("ok please carry on");

            System.out.println("The width of the ceiling");
            ceilingWidth = scanner.nextFloat();

            System.out.println("The height of the ceiling ");
            ceilingHeight = scanner.nextFloat();


        }
        double totalArea = (ceilingHeight * ceilingWidth);
        return totalArea;
    }


    public static float totalAreaOfDoor(){
        Scanner scanner = new Scanner(System.in);
        float doorHeight=0;
        float doorWidth=0;
        System.out.println("The height of the door ");
        doorHeight = scanner.nextFloat();

        System.out.println("The Width of the door ");
        doorWidth = scanner.nextFloat();

        double totalArea = (doorWidth * doorHeight);
        return (float) totalArea;
    }

    public static float totalAreaOfwindow(){
        Scanner scanner = new Scanner(System.in);
        float windowHeight=0;
        float windowWidth=0;
        System.out.println("The height of the window ");
        windowHeight = scanner.nextFloat();

        System.out.println("The Width of the window ");
        windowWidth = scanner.nextFloat();

        double totalArea = (windowHeight * windowWidth);
        return (float) totalArea;
    }

    public static float costOfPaintPerLitre(){
        Scanner scanner = new Scanner(System.in);
        float costOfPaintPerLitre=0;

        System.out.println("The cost per litre ");
        costOfPaintPerLitre = scanner.nextFloat();

        return 0;
    }

    public static float totalNumberOfCoats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number coats you want to apply ");
        int numberOfCoats = 0;
        String thatDoesntSeemRight = (numberOfCoats >= 3) ? "Thats Good" : "Too many coats";
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
        return numberOfCoats;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quoteAgain = true;
        do {

            float squareFeetPerLitre = 20;
            //float randomNumberGenerator = (float)(Math.random() * 20);

            paintColour();
            totalAreaOfWalls();
            totalAreaOfCeilings();
            totalAreaOfDoor();
            totalAreaOfwindow();
/*
            System.out.println("What colour of paint do you want?");
            String colour = scanner.nextLine();

            if (colour.matches (colourArray)){
                System.out.println("Thats perfect");
            }

            else if (false){
                    System.out.println("We dont have that sorry ");
                };
            String colourUsed  = new String(colour);
            System.out.println("Your color will be " + colourUsed);
            System.out.println();


              //  double areaOfEverything = ((totalAreaOfWalls + totalAreaOfCeiling) - (totalAreaOfDoor + totalAreaOfWindow));
              //  double result = ((totalAreaOfWalls * numberOfCoats) / squareFeetPerLitre);
              //  System.out.println("The price will be " + Math.round(result * costOfPaintPerLitre) + " pounds");



*/
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





