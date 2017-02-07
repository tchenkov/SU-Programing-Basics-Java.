package Uprajneniq;

import java.util.Scanner;

/**
 * Created by todor on 23.01.2017 г..
 */
public class u13_PointInTheFigure {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int blockSize = Integer.parseInt(scan.nextLine());
        int dotX = Integer.parseInt(scan.nextLine());
        int dotY = Integer.parseInt(scan.nextLine());

        boolean isDotInFigure = IsDotInsideFigure(blockSize, dotX, dotY);
        boolean isDotOutsideOfFigure = IsDotOutsideFigure(blockSize, dotX, dotY);

        if (isDotInFigure ) {
            System.out.println("inside");
        }
        else if (isDotOutsideOfFigure){
            System.out.println("outside");
        }
        else {
            System.out.println("border");
        }
    }

    static boolean IsDotInsideFigure(int size, int dotCoordinateX, int dotCoordinateY) {

        // Bottom Half of the figure
        //(x1 < x && x < x2) && (y1 < y && y < y2);
        boolean isDotInBottomFigure = (0 < dotCoordinateX && dotCoordinateX < (size * 3)) &&
                                      (0 < dotCoordinateY && dotCoordinateY < size);
        // Top Half of the figure
        //(x1 < x && x < x2) && (y1 <= y && y < y2);
        boolean isDotInTopFigure = (size < dotCoordinateX && dotCoordinateX < (size * 2)) &&
                                   (size <= dotCoordinateY && dotCoordinateY < (size * 4));

        boolean isInsideFigure = isDotInBottomFigure || isDotInTopFigure;

        return  isInsideFigure;
    }

    static boolean IsDotOutsideFigure(int size, int dotCoordinateX, int dotCoordinateY) {

        // Bottom Half of the figure
        //(x < x1 || x2 < x) || (y < y1 || y2 < y);
        boolean isDotOutsideBottomFigure = (dotCoordinateX < 0 || (size * 3 < dotCoordinateX)) ||
                (dotCoordinateY < 0 || size < dotCoordinateY);
        // Top Half of the figure
        //(x < x1 || x2 < x) || (y < y1 || y2 < y);
        boolean isDotOutsideTopFigure = (dotCoordinateX < size || (size * 2) < dotCoordinateX) ||
                (dotCoordinateY < size || (size * 4) < dotCoordinateY);

        boolean isDotOutsideFigure = isDotOutsideBottomFigure && isDotOutsideTopFigure;

        return  isDotOutsideFigure;
    }
}
