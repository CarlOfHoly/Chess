package com.chess.engine.board;


import java.util.Map;

public class BoardUtils {
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] FIRST_ROW = initRow(7);
    public static final boolean[] SECOND_ROW = initRow(6);
    public static final boolean[] THIRD_ROW = initRow(5);
    public static final boolean[] FOURTH_ROW = initRow(4);
    public static final boolean[] FIFTH_ROW = initRow(3);
    public static final boolean[] SIXTH_ROW = initRow(2);
    public static final boolean[] SEVENTH_ROW = initRow(1);
    public static final boolean[] EIGHTH_ROW = initRow(0);

    public static final String[] ALGEBRAIC_NOTATATION = initializeAlgebraicNotation();
    public static final Map<String, Integer> POSITION_TO_COORDINATE = initializePositionToCoordinateMap();

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    private static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[NUM_TILES];

        do {
            column[columnNumber] = true;
            columnNumber += NUM_TILES_PER_ROW;
        } while(columnNumber < NUM_TILES);
        return column;
    }

    private static boolean[] initRow(int rowNumber) {
        final boolean[] row = new boolean[NUM_TILES];

        for(int i = rowNumber * NUM_TILES_PER_ROW; i < rowNumber * NUM_TILES_PER_ROW + NUM_TILES_PER_ROW; i++) {
            row[i] = true;
        }
        return row;
    }

    private BoardUtils() {
        throw new RuntimeException("You cannot instantiate me!");
    }

    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate < NUM_TILES;
    }

//    public static int getCoordinateAtPosition(final String position) {
//        return POSITION_TO_COORDINATE.get(position);
//    }

//    public static int getPositionAtCoordinate(final int coordinate) {
//        return ALGEBRAIC_NOTATATION[coordinate];
//    }
}
