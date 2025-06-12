package com.controller;

// import java.util.Arrays;
// import java.util.List;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EleveController {
    @FXML
    private Label label;
    @FXML
    private JFXButton btnInscrire;
    @FXML
    private JFXButton btnSearch;
    @FXML
    private JFXButton btnListe;
    @FXML
    private JFXButton btnBulletin;
    @FXML
    private JFXButton btnDiscipline;
    @FXML
    private JFXButton btnAbsence;
    @FXML
    private JFXButton btnStats;
    @FXML
    private JFXButton btnExport;

    // private List<JFXButton> menuButtons;

    // @FXML
    // public void initialize() {
    // menuButtons = Arrays.asList(
    // btnInscrire, btnSearch, btnListe, btnBulletin, btnDiscipline, btnAbsence,
    // btnStats, btnExport
    // );
    // }

    // private void setActiveButton(JFXButton activeBtn) {
    // for (JFXButton btn : menuButtons) {
    // btn.getStyleClass().remove("active-horizontal");
    // }
    // activeBtn.getStyleClass().add("active-horizontal");
    // }

    @FXML
    private void inscrireEleve() {
        // setActiveButton(btnInscrire);
        System.out.println("Inscrire un élève cliqué");
        // TODO: Afficher le formulaire d'inscription
    }

    @FXML
    private void rechercherEleve() {
        // setActiveButton(btnSearch);
        System.out.println("Rechercher un élève cliqué");
        // TODO: Afficher la recherche d'élève
    }

    @FXML
    private void listeEleves() {
        // setActiveButton(btnListe);
        System.out.println("Liste des élèves cliqué");
        // TODO: Afficher la liste des élèves
    }

    @FXML
    private void bulletinsEleves() {
        // setActiveButton(btnBulletin);
        System.out.println("Bulletins & Moyennes cliqué");
        // TODO: Afficher les bulletins
    }

    @FXML
    private void disciplineEleves() {
        // setActiveButton(btnDiscipline);
        System.out.println("Suivi disciplinaire cliqué");
        // TODO: Afficher le suivi disciplinaire
    }

    @FXML
    private void absencesEleves() {
        // setActiveButton(btnAbsence);
        System.out.println("Absences & Retards cliqué");
        // TODO: Afficher les absences et retards
    }

    @FXML
    private void statsEleves() {
        // setActiveButton(btnStats);
        System.out.println("Statistiques cliqué");
        // TODO: Afficher les statistiques
    }

    @FXML
    private void exportEleves() {
        // setActiveButton(btnExport);
        System.out.println("Exporter/Imprimer cliqué");
        // TODO: Exporter ou imprimer les données
    }
}
