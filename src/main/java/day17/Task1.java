package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessPiece = new ArrayList<>();
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.KING_BLACK);
        chessPiece.add(ChessPiece.KING_BLACK);
        chessPiece.add(ChessPiece.KING_BLACK);
        chessPiece.add(ChessPiece.KING_BLACK);
        for (int i = 0; i < chessPiece.size(); i++) {
            System.out.print(chessPiece.get(i).getName() + " ");
        }

    }


}