package Controller;

import View.SearchDelete;
import View.Window;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchDeleteAction implements ActionListener {
    SearchDelete dialog;
    TableModel model;
    JTable table=new JTable();
    public SearchDeleteAction(SearchDelete dialog,TableModel model) {
        this.dialog = dialog;
        this.model=model;
    }

    public void actionPerformed(ActionEvent event) {
        if (dialog == null) // в первый раз
        {
            table.setModel(model);
            dialog = new SearchDelete(dialog.frame, dialog.name, table);
        }
        dialog.dialog.setVisible(true); // отобразить диалог

        /*JTable table = new JTable(model);
        JTableHeader header = table.getTableHeader();
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);*/
    }
}
