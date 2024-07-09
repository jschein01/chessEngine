import java.util.*;
public class boardRep {

    public static Piece[][] board = new Piece[8][8];

    public static void main(String[] args)
    {
        initBoard();
        for(int i = 0; i < 8; i++)
        {
            System.out.println("\n");
            for(int j =0 ; j < 8; j++)
            {
                System.out.print(board[i][j]);
            }
        }
        System.out.println("\n");
        System.out.println(getBasicScore());
    }

    public static void initBoard()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                if(i == 0)
                {
                    board[i][0] = Piece.whiteRook;
                    board[i][1] = Piece.whiteKnight;
                    board[i][2] = Piece.whiteBishop;
                    board[i][3] = Piece.whiteKing;
                    board[i][4] = Piece.whiteQueen;
                    board[i][5] = Piece.whiteBishop;
                    board[i][6] = Piece.whiteKnight;
                    board[i][7] = Piece.whiteRook;
                }
                else if(i==1)
                {
                    board[i][j] = Piece.whitePawn;
                }
                else if(i==6)
                {
                    board[i][j] = Piece.blackPawn;
                }
                else if(i==7)
                {
                    board[i][0] = Piece.blackRook;
                    board[i][1] = Piece.blackKnight;
                    board[i][2] = Piece.blackBishop;
                    board[i][3] = Piece.blackKing;
                    board[i][4] = Piece.blackQueen;
                    board[i][5] = Piece.blackBishop;
                    board[i][6] = Piece.blackKnight;
                    board[i][7] = Piece.blackRook;

                }else
                {
                    board[i][j] = Piece.empty;
                }
            }
        }
    }

    public static int getBasicScore()
    {
        int result = 0;
        for (int i =0; i < 8; i++)
        {
            for(int j= 0;j < 8; j++)
            {
                result += board[i][j].getValue();
            }
        }
        return result;
    }
}

