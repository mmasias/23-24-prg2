package entregas.roseteEirik.retoTicTacToe;

class TicTacToe {

    private Board board;
    private Player[] players;
    private Turn turn;

    public TicTacToe() {
        board = new Board();
        players = new Player[2];
        players[0] = new Player['X'];
        players[1] = new Player['O'];
        turn = new Turn();
    }

    public void play() {
        do {
            turn.change();
            board.show();
            if (!board.allTokensPlaced(players[turn.whoPlays()])) {
                players[turn.whoPlays()].placeToken(board);
            } else {
                players[turn.whoPlays()].moveToken(board);
            }
        } while(!board.winner());
        
        players[turn.whoPlays()].celebrate();

        return xd;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}