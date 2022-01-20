import java.net.StandardSocketOptions;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //float randomNumberGenerator = (float)(Math.random() * 20);
        float roomHeightWall1;
        float roomWidthWall1;
        float ceilingWidth;
        float ceilingHeight;
        float doorHeight;
        float doorWidth;
        float windowHeight;
        float windowWidth;
        int numberOfCoats =0;
        float costOfPaintPerLitre;
        String tooManyCoats = (numberOfCoats<3) ? "Too many coats":"Thats Good";

        float squareFeetPerLitre = 20;


        Scanner scanner = new Scanner(System.in);

        System.out.println("The Height of the wall ");
        roomHeightWall1 = scanner.nextFloat();

        if (roomHeightWall1>20){
            System.out.println("Be realistic");
        } else {


            System.out.println("The Width of the wall ");
            roomWidthWall1 = scanner.nextFloat();

            double totalAreaOfWalls = (roomWidthWall1 * roomHeightWall1);

            System.out.println("The Width of the ceiling ");
            ceilingWidth = scanner.nextFloat();

            System.out.println("The height of the ceiling ");
            ceilingHeight = scanner.nextFloat();

            double totalAreaOfCeiling = (ceilingHeight * ceilingWidth);

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

            switch(numberOfCoats){
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

            double areaOfEverything = ((totalAreaOfWalls + totalAreaOfCeiling) - (totalAreaOfDoor + totalAreaOfWindow));

            System.out.println(areaOfEverything);
        }





    }

}
