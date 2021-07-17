import javafx.application.*;
import javafx.beans.property.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class LambdaEventHandle extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        ToggleButton button = new ToggleButton("Click");

        final StringProperty btnText = button.textProperty();
        button.setOnAction((event) -> {    // lambda expression
            ToggleButton source = (ToggleButton) event.getSource();
            if(source.isSelected()) {
                btnText.set("Clicked!");
            } else {
                btnText.set("Click!");
            }
        });
        root.setCenter(button);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}