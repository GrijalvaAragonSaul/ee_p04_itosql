//saul, Juan, David
package Proyecto;
import Proyecto.ListaLigada;
import static Proyecto.Pro.base;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class mostrar extends javax.swing.JFrame {
DefaultComboBoxModel modelotablas,modelocampos;
Ord order= new Ord();
int z=0;
    


    public mostrar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("MOSTRAR");
        cargartablas();
        ((JPanel)getContentPane()).setOpaque(false); 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JTable();
        combot = new javax.swing.JComboBox<String>();
        ordenar = new javax.swing.JButton();
        metodos = new javax.swing.JComboBox<String>();
        combocampos = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("MOSTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablas);

        combot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotActionPerformed(evt);
            }
        });

        ordenar.setText("ORDENAR");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        metodos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quick Sort", "Burbuja", "Sharker", "SeleccionD", "InsercionB" }));
        metodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodosActionPerformed(evt);
            }
        });

        jLabel1.setText("Campo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ordenar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combot, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combocampos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 343, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combocampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(ordenar)))
                .addGap(59, 59, 59)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       Pro p=new Pro();
       p.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mostrarmatriz();      
    }//GEN-LAST:event_jButton1ActionPerformed
    public String[][] prueba(){
     String [][]t=new String [4][3];
     t[0][0]="id";t[0][1]="nombre";t[0][2]="edad";t[1][0]="400"; t[1][1]="Juan"; t[1][2]="10";
     t[2][0]="3400";t[2][1]="David";t[2][2]="30";t[3][0]="6300";t[3][1]="Toño";t[3][2]="1";
     return t;
    }
    
    public void mostrarmatriz(){
        
     DefaultTableModel model = (DefaultTableModel)tablas.getModel();
     
     
     String [][]t=Pro.vaciar(combot.getSelectedItem().toString());
     
     model.setRowCount(t.length);
     
     if(z==0){
         
     for(int d=0;d<t[0].length;d++){
         
      model.addColumn(t[0][d]);
      z++;
     }
     }
     
     for (int i = 1; i <t.length; i++) { 
            for (int j = 0; j <t[i].length; j++) {
               
                tablas.setValueAt(t[i][j], i-1, j);
            }
       
    }
    }
    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        //RECIBE TODO LO NECESARIO PARA ORDENAR
        String [][] tabla=base.vaciar(combot.getSelectedItem().toString());
        
        ListaLigada campos=base.regresacampos(tabla);
        
        ListaLigada datos=base.regresadatos(tabla);
        
        String d[]=order.crearMatriz(campos,datos,combocampos.getSelectedItem().toString(),metodos.getSelectedItem().toString());
        
        String n[]=order.crearTN(campos,combocampos.getSelectedItem().toString());
        
        refreshTable(n,d);
        
    }//GEN-LAST:event_ordenarActionPerformed
    public void refreshTable(String [] titulo, String [] datos){
        String [] encabezado = titulo;
                            DefaultTableModel modelo = new DefaultTableModel(encabezado,0);
                     tablas.setModel(new DefaultTableModel());
                                 for(int i=0;i<datos.length;i++){
               String palabra = datos[i];
                           String [] array = palabra.split(",");
                   Object [] d = array;
                 modelo.addRow(d);
       }
        tablas.setModel(modelo);
    }


   
    private void combotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotActionPerformed
       cargarcampos();
    }//GEN-LAST:event_combotActionPerformed

    private void metodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metodosActionPerformed
    public void cargartablas(){
     String []tab=base.rtablas();
     modelotablas=new DefaultComboBoxModel(tab);
     combot.setModel(modelotablas);
    }
    public void cargarcampos(){
     String []camp=base.rcampos(combot.getSelectedItem().toString());
     modelocampos=new DefaultComboBoxModel(camp);
     combocampos.setModel(modelocampos);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocampos;
    private javax.swing.JComboBox<String> combot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> metodos;
    private javax.swing.JButton ordenar;
    private javax.swing.JTable tablas;
    // End of variables declaration//GEN-END:variables
}
