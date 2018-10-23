package CowsAndBulls;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class MaineController {
    private int turnNr;
    public Spinner<Integer> spin1;
    public Spinner<Integer> spin2;
    public Spinner<Integer> spin3;
    public Spinner<Integer> spin4;
    public TableView<Turn> turns;

    public void initialize() {
        System.out.println("Heeeeellllo");
    }

    public void go() {
        turnNr++;
        int n1 = spin1.getValue();
        int n2 = spin2.getValue();
        int n3 = spin3.getValue();
        int n4 = spin4.getValue();
        System.out.println("" + n1 + n2 + n3 + n4);
        Turn turn = new Turn();
        turn.setGuess("" + n1 + n2 + n3 + n4);
        turn.setTurnNr(turnNr);
        turns.getItems().add(turn);

    }
}
