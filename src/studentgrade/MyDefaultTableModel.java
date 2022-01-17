/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

import javax.swing.table.DefaultTableModel;

/**
 * This is MyDefaultTableModel extends DefaultTableModel
 * the purpose is to limit the editing of cell
 * Because I only want to use JTable as a better way to realize "List" button
 * I do not need editing function or, the "Add" button loses its meaning.
 * @author Paul Duan
 */
public class MyDefaultTableModel extends DefaultTableModel{
    
    //Constructor with two args
    public MyDefaultTableModel(Object[][] data, Object[] columnNames) {
        //Use superclass's constructor
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        //no matter which rows and columns return "false"
        return false;
    }
    
}
