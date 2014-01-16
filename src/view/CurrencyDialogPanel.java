package view;

import model.Currency;
import model.CurrencySet;
import view.CurrencyDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CurrencyDialogPanel extends JPanel implements CurrencyDialog {

    private Currency currency;

    public CurrencyDialogPanel() {
        super(new FlowLayout(FlowLayout.LEFT));
    }

    @Override
    public void show() {
    }


    @Override
    public Currency getCurrency() {
        return currency;
    }
}

