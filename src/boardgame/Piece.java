package boardgame;

public class Piece {
    protected Position position;
    protected Board board;

    //
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //o tabuleiro será acessado pelo pacote tabuleiro e subslacces de peças
    protected Board getBoard() {
        return board;
    }
}
