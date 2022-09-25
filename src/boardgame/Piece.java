package boardgame;

public class Piece {
    protected Position position;
    protected Board board;

    //construtor da peça //posição incial será nula para informar que ainda não está no tabuleiro
    public Piece(Board board) {
        this.board = board;
        position = null; //opcional
    }

    //o tabuleiro será acessado pelo pacote tabuleiro e subslacces de peças
    protected Board getBoard() {
        return board;
    }
}
