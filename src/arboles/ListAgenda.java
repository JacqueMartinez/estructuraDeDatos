/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;
import static javafx.scene.input.KeyCode.S;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacQu
 */
public class ListAgenda <T extends BinarySearchTreeADT>{
    
     BinarySearchTreeList S = new BinarySearchTreeList();
        
       public void datos(){
        S.Add("juan");
        S.Add("maria");
        S.Add("zabdiel");
        S.Add("berenice");
        S.Add("pablo");
        S.Add("Guadalupe");
       }
       public void llenar_lista(String nombre){
           S.Add(nombre);
       }
         public void mostrar2(JTable JTContactos) {
        DefaultTableModel model = new DefaultTableModel();
       Object[] columns = new Object[1];
        System.out.println(S.size());
        Iterator a = S.iteratorInOrder();
        while (a.hasNext()) {            
            String r =String.valueOf(a.next());
            columns[0] = r;
            model.addRow(columns);
        }
       }
    
}