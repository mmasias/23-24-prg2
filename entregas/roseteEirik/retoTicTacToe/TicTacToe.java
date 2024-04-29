package entregas.roseteEirik.retoTicTacToe;

class TicTacToe {

    private Board board;
    private Player[] players;
    private Turn turn;

    public void play() {
        board = new Board();
        players = new Player[2];
        players[0] = new Player['X'];
        players[1] = new Player['O'];
        turn = new Turn();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}