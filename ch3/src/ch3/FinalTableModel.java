/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dawit.gebremichael1
 */


public class FinalTableModel extends AbstractTableModel {

    private List<CD> list = new ArrayList();
    private String[] columnNames = {"Title", "Artist", "Country", "Company"
    , "Price", "Year"};

    public FinalTableModel(List<CD> list) {
        this.list = list;
        
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
                
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CD si = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return si.getTitle();
            case 1:
                return si.getArtist();
            case 2:
                return si.getCountry();
            case 3:
                return si.getCompany();
            case 4:
                return si.getPrice();
            case 5:
                return si.getYear();
           
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return int.class;
           
        }
        return null;
    }
}
