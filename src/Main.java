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
        float numberOfCoats;
        float costOfPaintPerLitre;

        float squareFeetPerLitre = 20;


        Scanner scanner = new Scanner(System.in);

        System.out.println("The Height of the wall ");
        roomHeightWall1 = scanner.nextFloat();

        System.out.println("The Width of the wall ");
        roomWidthWall1 = scanner.nextFloat();

        double totalAreaOfWalls = (roomWidthWall1 * roomHeightWall1) ;


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
        numberOfCoats = scanner.nextFloat();

        double areaOfEverything = ((totalAreaOfDoor+totalAreaOfWindow)-(totalAreaOfWalls + totalAreaOfCeiling));

        System.out.println(areaOfEverything);


        /*float wall1SurfaceArea = (roomHeightWall1 * roomWidthWall1);
        float ceilingSurfaceArea = (ceilingHeight * ceilingWidth);
        float doorSurfaceArea = (doorHeight * doorWidth);
        float windowSurfaceArea = (windowHeight * windowWidth);
        float surfaceAreaOfAllWallsAndCeiling = wall1SurfaceArea +ceilingSurfaceArea;
        float areaThatIsDeducted = (doorSurfaceArea + windowSurfaceArea);
        float finalSurfaceArea = (surfaceAreaOfAllWallsAndCeiling - areaThatIsDeducted);
        float finalAreaNeeded = (finalSurfaceArea * numberOfCoats);
        float resultForAreaDivBySquareFeet = (finalAreaNeeded / squareFeetPerLitre / 10);
        float roundedUp = (Math.round(resultForAreaDivBySquareFeet));
       */ //  float costResult = (roundedUp * costOfPaintPerLitre);



    }

}
