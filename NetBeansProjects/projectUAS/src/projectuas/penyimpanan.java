
package projectuas;

import javax.swing.table.DefaultTableModel;

public class penyimpanan {
 private DefaultTableModel tabel = new DefaultTableModel();
 public penyimpanan(){
     getTable().addColumn("No.");
             getTable().addColumn("Nama");
                     getTable().addColumn("Banyaknya");
                             getTable().addColumn("Harga");
                                     getTable().addColumn("Total");
 }
 
 public DefaultTableModel getTable(){
     return tabel;
 }
}
