package com.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import com.jfoenix.controls.JFXButton;
// import java.util.Arrays;
// import java.util.List;

public class DashboardDEController {
    @FXML
    private StackPane contentPane;
    @FXML
    private JFXButton btnAccueil;
    @FXML
    private JFXButton btnEleves;
    @FXML
    private JFXButton btnEnseignant;
    @FXML
    private JFXButton btnEmploi;
    @FXML
    private JFXButton btnNotes;
    @FXML
    private JFXButton btnRapports;
    @FXML
    private JFXButton btnLogout;

    // private List<JFXButton> menuButtons;

    // @FXML
    // public void initialize() {
    // menuButtons = Arrays.asList(
    // btnAccueil, btnEleves, btnEnseignant, btnEmploi, btnNotes, btnRapports,
    // btnLogout);
    // }

    // private void setActiveButton(JFXButton activeBtn) {
    // for (JFXButton btn : menuButtons) {
    // if (btn == null) {
    // System.err.println("Un bouton du menu vertical est null !");
    // continue;
    // }
    // btn.getStyleClass().remove("active-vertical");
    // }
    // if (activeBtn != null) {
    // activeBtn.getStyleClass().add("active-vertical");
    // }
    // }

    @FXML
    private void showAccueil() {
        // setActiveButton(btnAccueil);
        System.out.println("Accueil cliqué");
        // TODO: Afficher la vue Accueil dans contentPane
    }

    @FXML
    private void showEleves() {
        // setActiveButton(btnEleves);
        try {
            contentPane.getChildren().clear();
            javafx.scene.Parent pane = javafx.fxml.FXMLLoader
                    .load(getClass().getResource("/view/fxml/eleve/eleve.fxml"));
            contentPane.getChildren().add(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void showEnseignant() {
        // setActiveButton(btnEnseignant);
        System.out.println("Enseignants cliqué");
        // TODO: Afficher la vue Enseignants dans contentPane
    }

    @FXML
    private void showEmploi() {
        // setActiveButton(btnEmploi);
        System.out.println("Emploi du Temps cliqué");
        // TODO: Afficher la vue Emploi du Temps dans contentPane
    }

    @FXML
    private void showNotes() {
        // setActiveButton(btnNotes);
        System.out.println("Notes cliqué");
        // TODO: Afficher la vue Notes dans contentPane
    }

    @FXML
    private void showRapports() {
        // setActiveButton(btnRapports);
        System.out.println("Rapports cliqué");
        // TODO: Afficher la vue Rapports dans contentPane
    }

    @FXML
    private void logout() {
        // setActiveButton(btnLogout);
        System.out.println("Déconnexion cliquée");
        // TODO: Gérer la déconnexion
    }
}
