package com.example.ejemploprogressbar;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private ProgressBar progressBar;
    @FXML
    private ProgressIndicator progressIndicator;

    private Timeline timeline;
    private double progress = 0;

    // Método para iniciar el progreso
    @FXML
    public void startProgress(ActionEvent actionEvent) {
        if (timeline != null) {
            timeline.stop();
        }

        timeline = new Timeline(new KeyFrame(Duration.seconds(0.1), event -> {
            if (progress < 1) {
                progress += 0.01;
                progressBar.setProgress(progress);
                progressIndicator.setProgress(progress);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    // Método para reiniciar el progreso
    @FXML
    public void resetProgress(ActionEvent actionEvent) {
        if (timeline != null) {
            timeline.stop();
        }
        progress = 0;
        progressBar.setProgress(0);
        progressIndicator.setProgress(0);
    }
}
