package pe.egcc.eurekaapp.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eurekaapp.controller.EmpleadoController;
import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.util.Eureka;
import pe.egcc.eurekaapp.util.Memoria;

public class MantEmpleados extends javax.swing.JInternalFrame {

  private List<Empleado> lista = null;

  public MantEmpleados() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();
    txtPaterno = new javax.swing.JTextField();
    txtMaterno = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    btnNuevo = new javax.swing.JButton();
    btnEditar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    btnExcel = new javax.swing.JButton();
    btnPDF = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaDatos = new javax.swing.JTable();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("MANTENIMIENTO DE EMPLEADOS");

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" [ FILTRO ] "));

    jLabel1.setText("Código");

    jLabel2.setText("Paterno");

    jLabel3.setText("Materno");

    jLabel4.setText("nombre");

    btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/buscar.png"))); // NOI18N
    btnBuscar.setToolTipText("Buscar clientes.");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarActionPerformed(evt);
      }
    });

    btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/nuevo.png"))); // NOI18N
    btnNuevo.setToolTipText("Nuevo cliente.");
    btnNuevo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNuevoActionPerformed(evt);
      }
    });

    btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/editar.png"))); // NOI18N
    btnEditar.setToolTipText("Editar cliente actual.");
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/tacho.png"))); // NOI18N
    btnEliminar.setToolTipText("Eliminar cliente actual.");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarActionPerformed(evt);
      }
    });

    btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/excel.png"))); // NOI18N
    btnExcel.setToolTipText("Exportar datos a excel.");

    btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/pdf.png"))); // NOI18N
    btnPDF.setToolTipText("Exportar datos a PDF.");

    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/eurekaapp/img/exit.png"))); // NOI18N
    btnSalir.setToolTipText("Cerrar de esta ventana.");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(txtCodigo)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnBuscar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnNuevo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnEditar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnEliminar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnExcel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnPDF)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSalir)
        .addContainerGap(109, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" [ RESULTADO ] "));

    tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "CODIG", "PATERNO", "MATERNO", "NOMBRE", "DIRECCIÓN", "CIUDAD", "USUARIO"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane1.setViewportView(tablaDatos);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      try {
        // Datos
        Empleado bean = new Empleado();
        bean.setCodigo(txtCodigo.getText());
        bean.setPaterno(txtPaterno.getText());
        bean.setMaterno(txtMaterno.getText());
        bean.setNombre(txtNombre.getText());

        EmpleadoController control = new EmpleadoController();
        lista = control.traerEmpleado(bean);
        System.out.println("lista: " + lista.size());
        mostrarLista(); // Cargar la lista en la tabla
        // Mostrar Lista
      } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
      }
    }//GEN-LAST:event_btnBuscarActionPerformed

  private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    Empleado bean = new Empleado();
    bean.setCodigo("NONE");
    Memoria.put("bean", null);
    EditarEmpleadoView view = new EditarEmpleadoView(null, true);
    view.setAccion(Eureka.CRUD_NUEVO);
    view.setBean(bean);
    view.setVisible(true);
    if( Memoria.get("bean") == null ){ // Se hizo click en el botón cancelar.
      return;
    }
    bean = (Empleado) Memoria.get("bean");
    if(lista == null){
      lista = new ArrayList<>();
    }
    lista.add(0, bean);
    mostrarLista();
    tablaDatos.setRowSelectionInterval(0, 0);
  }//GEN-LAST:event_btnNuevoActionPerformed

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int fila = tablaDatos.getSelectedRow();
    if(fila == -1){
      return;
    }
    Empleado bean = lista.get(fila);
    Memoria.put("bean", null);
    EditarEmpleadoView view = new EditarEmpleadoView(null, true);
    view.setAccion(Eureka.CRUD_EDITAR);
    view.setBean(bean);
    view.setVisible(true);
    if( Memoria.get("bean") == null ){ // Se hizo click en el botón cancelar.
      return;
    }
    bean = (Empleado) Memoria.get("bean");
    lista.set(fila, bean);
    // Modificar fila
    tablaDatos.setValueAt(bean.getPaterno(), fila, 1);
    tablaDatos.setValueAt(bean.getMaterno(), fila, 2);
    tablaDatos.setValueAt(bean.getNombre(), fila, 3);
    tablaDatos.setValueAt(bean.getDireccion(), fila, 4);
    tablaDatos.setValueAt(bean.getCiudad(), fila, 5);
    tablaDatos.setValueAt(bean.getUsuario(), fila, 6);
  }//GEN-LAST:event_btnEditarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila = tablaDatos.getSelectedRow();
    if(fila == -1){
      return;
    }
    Empleado bean = lista.get(fila);
    Memoria.put("bean", null);
    EditarEmpleadoView view = new EditarEmpleadoView(null, true);
    view.setAccion(Eureka.CRUD_ELIMINAR);
    view.setBean(bean);
    view.setVisible(true);
    if( Memoria.get("bean") == null ){ // Se hizo click en el botón cancelar.
      return;
    }
    lista.remove(fila);
    mostrarLista();
  }//GEN-LAST:event_btnEliminarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnExcel;
  private javax.swing.JButton btnNuevo;
  private javax.swing.JButton btnPDF;
  private javax.swing.JButton btnSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tablaDatos;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JTextField txtMaterno;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtPaterno;
  // End of variables declaration//GEN-END:variables

  private void mostrarLista() {
    if (lista == null) {
      return;
    }
    // Accediendo al model
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tablaDatos.getModel();
    // Eliminar toda la data
    tabla.setRowCount(0);
    // LLenando la tabla con datos
    for (Empleado bean : lista) {
      Object[] rowData = {bean.getCodigo(), bean.getPaterno(), 
        bean.getMaterno(), bean.getNombre(),bean.getDireccion(),
        bean.getCiudad(), bean.getUsuario()};
      tabla.addRow(rowData);
    }
  }
}
