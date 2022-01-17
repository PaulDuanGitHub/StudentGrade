/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * This is MyDefaultTableCellRenderer class extends DafaultTableCellRenderer
 * The purpose of this class is to repaint the border of focus(selected) cell of
 * JTable. I do not like the look of dash line border.
 * @author Paul Duan
 */
public class MyDefaultTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        //below code is from DeafaltTableCellRenderer class
        if (hasFocus) {
            Border border = null;
            if (isSelected) {
                //change the border to black line border
                border = javax.swing.BorderFactory.createLineBorder(Color.black);
            }
            setBorder(border);
        }
        //return this class as Component object, because DefaultTableCellRenderer is a subclass of Component
        return this;

    }

}
