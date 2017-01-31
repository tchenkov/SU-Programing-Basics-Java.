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

        int parametersBottom[] = FigureParameters(blockSize, dotX, dotY, true);
        int parametersTop[] = FigureParameters(blockSize, dotX, dotY, false);

        boolean isDotInBottomHalf = IsDotInsideHalfFigure(parametersBottom);
        boolean isDotInTopHalfI = IsDotInsideHalfFigure(parametersTop);
        boolean isInFigure = isDotInBottomHalf || isDotInTopHalfI;

        if (isInFigure ) {


            boolean isDotOnBottomHalfBorder = IsDotOnBorder(parametersBottom);
            boolean isDotOnTopHalfBorder = IsDotOnBorder(parametersTop);
            boolean isDotOnBorder = isDotOnBottomHalfBorder || isDotOnTopHalfBorder;

            int commonLineX1 = blockSize;
            int commonLineX2 = blockSize * 2;
            int commonLineY = blockSize;
            boolean isDotOnCommonSide = dotY == commonLineY && (commonLineX1 < dotX && dotX < commonLineX2);
            if (isDotOnBorder && !isDotOnCommonSide) {
                System.out.println("border");
            }
            else {
                System.out.println("inside");
            }

        }
        else {
            System.out.println("outside");
        }
    }

    static boolean IsDotInsideHalfFigure(int figureAndDotCoordinates[]) {

        int x1 = figureAndDotCoordinates[0];
        int y1 = figureAndDotCoordinates[1];
        int x2 = figureAndDotCoordinates[2];
        int y2 = figureAndDotCoordinates[3];
        int x = figureAndDotCoordinates[4];
        int y = figureAndDotCoordinates[5];

        boolean isInRectangle = (x1 <= x && x <= x2) && (y1 <= y && y <= y2);

        return  isInRectangle;
    }

    static boolean IsDotOnBorder(int figureAndDotCoordinates[]) {
        int x1 = figureAndDotCoordinates[0];
        int y1 = figureAndDotCoordinates[1];
        int x2 = figureAndDotCoordinates[2];
        int y2 = figureAndDotCoordinates[3];
        int x = figureAndDotCoordinates[4];
        int y = figureAndDotCoordinates[5];

        boolean isOnLeftBorder = x == x1 && (y1 <= y && y <= y2);
        boolean isOnRightBorder = x == x2 && (y1 <= y && y <= y2);
        boolean isOnTopBorder = y == y1 && (x1 <= x && x <= x2);
        boolean isOnBottomBorder = y == y2 && (x1 <= x && x <= x2);

        boolean isOnAnyBorder = isOnLeftBorder || isOnRightBorder || isOnTopBorder || isOnBottomBorder;

        return isOnAnyBorder;
    }

    static int[] FigureParameters (int size, int dotX, int dotY, boolean isBottom) {

        int[] parameters = new int[6];
        if (isBottom) {
            parameters[0] = 0;
            parameters[1] = 0;
            parameters[2] = size * 3;
            parameters[3] = size;
        }
        else {
            parameters[0] = size;
            parameters[1] = size;
            parameters[2] = size * 2;
            parameters[3] = size * 4;
        }

        parameters[4] = dotX;
        parameters[5] = dotY;

        return parameters;
    }
}
