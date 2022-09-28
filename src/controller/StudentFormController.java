package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public RadioButton rbtnMale;
    public ToggleGroup Gender;
    public RadioButton rbtnFemale;
    public TableView tblStudent;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colGender;
    public TableColumn colOption;

    public void updateOnAction(ActionEvent actionEvent) {
    }

    public void saveOnAction(ActionEvent actionEvent) {
    }
}
