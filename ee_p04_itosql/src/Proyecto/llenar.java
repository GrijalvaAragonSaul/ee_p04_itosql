
package Proyecto;
import static Proyecto.Pro.base;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Saul
 */
public class llenar extends javax.swing.JFrame {
    DefaultComboBoxModel modelotablas,modelocampos;
    DefaultTableModel modelo;
    int z=0;
    
    public llenar() {
        initComponents();
        cargartablas();
        this.setLocationRelativeTo(this);
        this.setTitle("DATOS");
        
        ((JPanel)getContentPane()).setOpaque(false); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        tabla = new javax.swing.JLabel();
        campo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ddato = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ta = new javax.swing.JComboBox<String>();
        ca = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setText("Tabla :");

        campo.setText("Campo :");

        jLabel3.setText("Dato :");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taActionPerformed(evt);
            }
        });

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(data);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ddato))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tabla)
                            .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo)
                                    .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(agregar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ddato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addComponent(jButton1)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        base.agregardatos(ta.getSelectedItem().toString(),ca.getSelectedItem().toString(),ddato.getText());
        String []datos =new String[3];
        datos[0]=ta.getSelectedItem().toString();
        datos[1]=ca.getSelectedItem().toString();
        datos[2]=ddato.getText();
        ddato.setText(null);
    
        mostrarmatriz();
    }//GEN-LAST:event_agregarActionPerformed
    
    public void cargartablas(){
     String []tab=base.rtablas();
     modelotablas=new DefaultComboBoxModel(tab);
     ta.setModel(modelotablas);
    }
    
    public void mostrarmatriz(){
     DefaultTableModel model = (DefaultTableModel)data.getModel();
     String [][]t=base.vaciar(ta.getSelectedItem().toString());
     
     model.setRowCount(t.length);
     
     if(z==0){
     for(int d=0;d<t[0].length;d++){
      model.addColumn(t[0][d]);
      z++;
     }
     }
     
     for (int i = 1; i <t.length; i++) { 
            for (int j = 0; j <t[i].length; j++) {
                //System.out.print(datos[i][j] + " ");
                data.setValueAt(t[i][j], i-1, j);
            }
         
    }
    }
    
    public void cargarcampos(){
     String []camp=base.rcampos(ta.getSelectedItem().toString());
     modelocampos=new DefaultComboBoxModel(camp);
     ca.setModel(modelocampos);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pro p=new Pro();
       p.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taActionPerformed
        cargarcampos();
    }//GEN-LAST:event_taActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new llenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> ca;
    private javax.swing.JLabel campo;
    private javax.swing.JTable data;
    private javax.swing.JTextField ddato;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> ta;
    private javax.swing.JLabel tabla;
    // End of variables declaration//GEN-END:variables
}
