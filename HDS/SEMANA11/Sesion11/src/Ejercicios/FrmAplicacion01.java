
package Ejercicios;
//La clase del JFrame

import javax.swing.JOptionPane;

public class FrmAplicacion01 extends javax.swing.JFrame {
  //Constructor
  public FrmAplicacion01() {
    initComponents();
    //Estableciendo en modo lectura a las cajas de textos
    txtPromedio.setEditable(false);
    txtEstado.setEditable(false);    
  } 
  @SuppressWarnings("unchecked")                
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtAlumno = new javax.swing.JTextField();
    txtNota1 = new javax.swing.JTextField();
    txtNota2 = new javax.swing.JTextField();
    txtNota3 = new javax.swing.JTextField();
    txtPromedio = new javax.swing.JTextField();
    txtEstado = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    btnNuevo = new javax.swing.JButton();
    btnCalcular = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setText("REGISTRO DE NOTAS");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setText("Nombre del Alumno :");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setText("Nota 1:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setText("Nota 2:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setText("Nota 3:");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setText("Promedio :");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setText("Estado del Alumno :");

    txtAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtNota1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtNota2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtNota3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnNuevo.setText("Nuevo");
    btnNuevo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNuevoActionPerformed(evt);
      }
    });

    btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnCalcular.setText("Calcular");
    btnCalcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCalcularActionPerformed(evt);
      }
    });

    btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnCalcular)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(106, 106, 106))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
              .addGap(79, 79, 79)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3)
                .addComponent(jLabel2)
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(jLabel6)
                .addComponent(jLabel7))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtAlumno)
                .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(txtPromedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                  .addComponent(txtNota3, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtNota2, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtNota1, javax.swing.GroupLayout.Alignment.LEADING))))
            .addGroup(layout.createSequentialGroup()
              .addGap(43, 43, 43)
              .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(174, 174, 174)
            .addComponent(jLabel1)))
        .addContainerGap(25, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabel1)
        .addGap(27, 27, 27)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNuevo)
          .addComponent(btnCalcular)
          .addComponent(btnSalir))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
//Evento del JFrame que se ejecuta cuando se abre 
  //la ventana
  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // this =>hace referencia a la Clase del JFrame actual
    JOptionPane.showMessageDialog(this,
          "Cargando Registro de Notas");   
  }//GEN-LAST:event_formWindowOpened

  private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    //setText(cadena) =>escribe una cadena
    txtAlumno.setText("");
    txtNota1.setText("");txtNota2.setText("");
    txtNota3.setText("");txtEstado.setText("");
    txtPromedio.setText("");
    //enfocando al control
    txtAlumno.requestFocus();
  }//GEN-LAST:event_btnNuevoActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    int r=JOptionPane.showOptionDialog(
     this,
     "Realmente desea Salir ...",
     "Registro de Notas", 
     JOptionPane.YES_NO_OPTION , 
     JOptionPane.QUESTION_MESSAGE,
      null,null,null);
    if(r==0) // si presiono el boton Si
    { //Finaliza aplicacion
        System.exit(0);
    }
  }//GEN-LAST:event_btnSalirActionPerformed

  private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
    //validando si las cajas de texto estan vacias
    //  getText() => Leer el texto
    if(txtAlumno.getText().equals(""))
    {
      JOptionPane.showMessageDialog(this,
      "No ha ingresado el nombre del alumno");
    }
    // | => ALT+124    || =  OR
    else if(txtNota1.getText().equals("") ||
      txtNota2.getText().equals("") || 
      txtNota3.getText().equals(""))
    {
      JOptionPane.showMessageDialog(this,
        "Faltan ingresar notas");
    }
    else //Evaluando y sacar el promedio
    { //declaracion de variables
      int n1=0,n2=0,n3=0,susti=0,notamin=0;
      double promedio;
      String mensaje="";
      //Evaluando el rango de notas de 0-20
      n1=Integer.parseInt(txtNota1.getText());
      n2=Integer.parseInt(txtNota2.getText());
      n3=Integer.parseInt(txtNota3.getText());
      if(n1 < 0 || n1 >20){
         JOptionPane.showMessageDialog(this,
           "Nota fuera de Rango [0-20]");
         return; //finalize el evento 
      }
      if(n2 < 0 || n2 >20){
         JOptionPane.showMessageDialog(this,
           "Nota fuera de Rango [0-20]");
         return; //finalize el evento 
      }
      if(n3 < 0 || n3 >20){
         JOptionPane.showMessageDialog(this,
           "Nota fuera de Rango [0-20]");
         return; //finalize el evento 
      }
      //evaluando el promedio
        //   12+12+12 =36 *1.0 =36.0 /3
      promedio=((n1+n2+n3)*1.0)/3;
      if(promedio >12.5)
         mensaje="Alumno Beca 18 Aprobado";
      else
      {
         mensaje="Alumno Beca 18 Desaprobado";
      }
      //Mostrando los datos   & => VB- java +
      //txtPromedio.setText(String.valueOf(promedio));
      txtPromedio.setText(""+Math.round(promedio));
      txtEstado.setText(mensaje);      
    }
  }//GEN-LAST:event_btnCalcularActionPerformed


  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrmAplicacion01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmAplicacion01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmAplicacion01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmAplicacion01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmAplicacion01().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCalcular;
  private javax.swing.JButton btnNuevo;
  private javax.swing.JButton btnSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTextField txtAlumno;
  private javax.swing.JTextField txtEstado;
  private javax.swing.JTextField txtNota1;
  private javax.swing.JTextField txtNota2;
  private javax.swing.JTextField txtNota3;
  private javax.swing.JTextField txtPromedio;
  // End of variables declaration//GEN-END:variables
}
