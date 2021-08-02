package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button displayLabel;
    @FXML
    private Button enterButton1;
    @FXML
    private Button enterButton2;
    @FXML
    private Label guestLabel;
    @FXML
    private TextField enterField;
    @FXML
    private TextField checkoutField;
    @FXML
    private Label zeroLabel;

    int guests = 0;



    public void enterGuests() {

        String guest = enterField.getText();


        int guestNum = Integer.parseInt(guest);
        guests += guestNum;
        displayGuests();
        enterField.clear();

    }

    public void checkOutGuests() {
        zeroLabel.setText("");
        String guest = checkoutField.getText();
        int checkout = Integer.parseInt(guest);

        if(checkout < 0) {
            zeroLabel.setText("There cannot be less than zero guests. ");
        }

        if(guests >= checkout) {
             guests -= checkout;
        }




        displayGuests();
        checkoutField.clear();
    }

    public void displayGuests() {
        guestLabel.setText("Current number of guests: " + guests);
    }

}
