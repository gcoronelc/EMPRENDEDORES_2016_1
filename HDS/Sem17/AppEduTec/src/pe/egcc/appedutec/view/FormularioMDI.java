package pe.egcc.appedutec.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class FormularioMDI extends javax.swing.JFrame {

  public FormularioMDI() {
    initComponents();
    setExtendedState(MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    desktopPane = new javax.swing.JDesktopPane();
    menuBar = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuArchivoSalir = new javax.swing.JMenuItem();
    menuConsulta = new javax.swing.JMenu();
    menuConsultaProfesores = new javax.swing.JMenuItem();
    menuConsultaCursos = new javax.swing.JMenuItem();
    jMenuItem4 = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("APRENDIENDO JAVA");

    menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/appedutec/img/categoria.png"))); // NOI18N
    menuArchivo.setText("Archivo");

    menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
    menuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/appedutec/img/salir.png"))); // NOI18N
    menuArchivoSalir.setText("Salir");
    menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuArchivoSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(menuArchivoSalir);

    menuBar.add(menuArchivo);

    menuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/appedutec/img/buscar.png"))); // NOI18N
    menuConsulta.setText("Consultas");

    menuConsultaProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/appedutec/img/empleado.png"))); // NOI18N
    menuConsultaProfesores.setText("Profesores");
    menuConsultaProfesores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuConsultaProfesoresActionPerformed(evt);
      }
    });
    menuConsulta.add(menuConsultaProfesores);

    menuConsultaCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/appedutec/img/libro_azul.png"))); // NOI18N
    menuConsultaCursos.setText("Cursos");
    menuConsultaCursos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuConsultaCursosActionPerformed(evt);
      }
    });
    menuConsulta.add(menuConsultaCursos);

    jMenuItem4.setText("jMenuItem4");
    menuConsulta.add(jMenuItem4);

    menuBar.add(menuConsulta);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void menuConsultaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaProfesoresActionPerformed
    cargarFormulario(ConsultaProfesoresView.class);
  }//GEN-LAST:event_menuConsultaProfesoresActionPerformed

  private void menuConsultaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaCursosActionPerformed
    cargarFormulario(ConsultaCursoView.class);
  }//GEN-LAST:event_menuConsultaCursosActionPerformed

  /**
   * @param args the command line arguments
   */
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
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormularioMDI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenuItem menuArchivoSalir;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuConsulta;
  private javax.swing.JMenuItem menuConsultaCursos;
  private javax.swing.JMenuItem menuConsultaProfesores;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {
    try {
      // Variable de control
      JInternalFrame view = null; 
      // Buscar en el desktopPane
      for(JInternalFrame f: desktopPane.getAllFrames()){
        if(aClass.isInstance(f)){
          view = f;
          break;
        }
      }
      // Crear el objeto
      if( view == null ){
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
        view.setVisible(true);
      }
      // Activar el formulario
      view.setSelected(true);
      view.setMaximum(true);
    } catch (Exception e) {
    }
  }

}
