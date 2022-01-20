import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        float randomNumberGenerator = (float)(Math.random() * 20);

        float roomHeightWall1 = randomNumberGenerator;  //in any dimensions
        float roomWidthWall1 = randomNumberGenerator;
        float roomHeightWall2 = randomNumberGenerator;
        float roomWidthWall2 = randomNumberGenerator;
        float roomHeightWall3 = 10;
        float roomWidthWall3 = 12;
        float roomHeightWall4 = 10;
        float roomWidthWall4 = 12;
        float ceilingWidth = 12;
        float ceilingHeight = 12;
        float doorHeight = 8;
        float doorWidth = 4;
        float windowHeight = 6;
        float windowWidth = 5;
        float numberOfCoats = 2;
        float squareFeetPerLitre = 20;
        double costOfPaintPerLitre = 4.99;


        float wall1SurfaceArea = (roomHeightWall1*roomWidthWall1);
        float wall2SurfaceArea = (roomHeightWall2*roomWidthWall2);
        float wall3SurfaceArea = (roomHeightWall3*roomWidthWall3);
        float wall4SurfaceArea = (roomHeightWall4*roomWidthWall4);
        float ceilingSurfaceArea = (ceilingHeight*ceilingWidth);
        float doorSurfaceArea = (doorHeight*doorWidth);
        float windowSurfaceArea = (windowHeight*windowWidth);
        float surfaceAreaOfAllWallsAndCeiling = (wall1SurfaceArea+wall2SurfaceArea+wall3SurfaceArea+wall4SurfaceArea+ceilingSurfaceArea);
        float areaThatIsDeducted = (doorSurfaceArea+windowSurfaceArea);
        float finalSurfaceArea = (surfaceAreaOfAllWallsAndCeiling-areaThatIsDeducted);
        float finalAreaNeeded =(finalSurfaceArea*numberOfCoats);
        float resultForAreaDivBySquareFeet =(finalAreaNeeded/squareFeetPerLitre/10);
        float roundedUp = (Math.round(resultForAreaDivBySquareFeet));
        double costResult = (roundedUp * costOfPaintPerLitre);

        //Scanner scanner = new Scanner(System.in);
       // System.out.println("what is your name ");

        System.out.println("This will cost £" + costResult + " pounds" + " To paint one room");
    }
}

