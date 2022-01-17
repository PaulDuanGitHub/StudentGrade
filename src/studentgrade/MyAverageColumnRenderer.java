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
 * This is MyAverageColumnRenderer class extends DefaultTableCellRenderer
 * The purpose is to repaint the border of the last column which is average scores
 * @author Paul Duan
 */
public class MyAverageColumnRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        //matte border only with right and left side, blue color
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new Color(51, 102, 255)));
        setForeground(new Color(51, 102, 255));
        //black line border is selected
        if (hasFocus) {
            Border border = null;
            if (isSelected) {
                border = javax.swing.BorderFactory.createLineBorder(Color.black);
            }
            setBorder(border);
        }
        return this;
    }
    
}
