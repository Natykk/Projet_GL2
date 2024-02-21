package com.hashi.style;

import java.awt.Color;
import java.awt.Graphics2D;

public class SummerStyle extends Style {
    public SummerStyle() {
        name = "summer";
        bg_color = Color.white;
        fg_color = Color.black;
        font = getFontResource(getResourcePath("kindergarten.ttf"));
    }

    public void initPanel(Panel panel) {

    }

    public void paintPanel(Panel panel, Graphics2D g) {
        if (panel.getImage() != null) {
            g.drawImage(panel.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
        }
    }

    public void paintPanelBorder(Panel panel, Graphics2D g) {

    }

    public void initButton(Button button) {

    }

    public void paintButton(Button button, Graphics2D g) {

    }

    public void paintButtonBorder(Button button, Graphics2D g) {

    }

    public void initLabel(Label label) {

    }

    public void paintLabel(Label label, Graphics2D g) {

    }

    public void paintLabelBorder(Label label, Graphics2D g) {

    }

    public <E> void initComboBox(ComboBox<E> combo_box) {

    }

    public <E> void paintComboBox(ComboBox<E> combo_box, Graphics2D g) {

    }

    public <E> void paintComboBoxBorder(ComboBox<E> combo_box, Graphics2D g) {

    }

    public void initTextField(TextField text_field) {

    }

    public void paintTextField(TextField text_field, Graphics2D g) {

    }

    public void paintTextFieldBorder(TextField text_field, Graphics2D g) {

    }
}