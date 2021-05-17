package sample;
import sample.Data.*;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public DialogController() {
    }

    public TodoItems processResults() {
        String shortDescription = this.shortDescriptionField.getText().trim();
        String details = this.detailsArea.getText().trim();
        LocalDate deadlineValue = (LocalDate)this.deadlinePicker.getValue();
        TodoItems newItem = new TodoItems(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
