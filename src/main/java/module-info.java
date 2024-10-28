module org.example.lectureassignmentweek2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lectureassignmentweek2 to javafx.fxml;
    exports org.example.lectureassignmentweek2;
}