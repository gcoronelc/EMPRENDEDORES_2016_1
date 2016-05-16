<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form2
  Inherits System.Windows.Forms.Form

  'Form reemplaza a Dispose para limpiar la lista de componentes.
  <System.Diagnostics.DebuggerNonUserCode()> _
  Protected Overrides Sub Dispose(ByVal disposing As Boolean)
    Try
      If disposing AndAlso components IsNot Nothing Then
        components.Dispose()
      End If
    Finally
      MyBase.Dispose(disposing)
    End Try
  End Sub

  'Requerido por el Diseñador de Windows Forms
  Private components As System.ComponentModel.IContainer

  'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
  'Se puede modificar usando el Diseñador de Windows Forms.  
  'No lo modifique con el editor de código.
  <System.Diagnostics.DebuggerStepThrough()> _
  Private Sub InitializeComponent()
    Me.lstDatos = New System.Windows.Forms.ListBox()
    Me.btnMostrar = New System.Windows.Forms.Button()
    Me.btnCerrar = New System.Windows.Forms.Button()
    Me.SuspendLayout()
    '
    'lstDatos
    '
    Me.lstDatos.FormattingEnabled = True
    Me.lstDatos.Location = New System.Drawing.Point(27, 29)
    Me.lstDatos.Name = "lstDatos"
    Me.lstDatos.Size = New System.Drawing.Size(158, 277)
    Me.lstDatos.TabIndex = 0
    '
    'btnMostrar
    '
    Me.btnMostrar.Location = New System.Drawing.Point(234, 29)
    Me.btnMostrar.Name = "btnMostrar"
    Me.btnMostrar.Size = New System.Drawing.Size(158, 76)
    Me.btnMostrar.TabIndex = 1
    Me.btnMostrar.Text = "Mostrar"
    Me.btnMostrar.UseVisualStyleBackColor = True
    '
    'btnCerrar
    '
    Me.btnCerrar.Location = New System.Drawing.Point(234, 128)
    Me.btnCerrar.Name = "btnCerrar"
    Me.btnCerrar.Size = New System.Drawing.Size(158, 76)
    Me.btnCerrar.TabIndex = 2
    Me.btnCerrar.Text = "Cerrar"
    Me.btnCerrar.UseVisualStyleBackColor = True
    '
    'Form2
    '
    Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
    Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
    Me.ClientSize = New System.Drawing.Size(444, 359)
    Me.Controls.Add(Me.btnCerrar)
    Me.Controls.Add(Me.btnMostrar)
    Me.Controls.Add(Me.lstDatos)
    Me.Name = "Form2"
    Me.Text = "LISTADO"
    Me.ResumeLayout(False)

  End Sub

  Friend WithEvents lstDatos As ListBox
  Friend WithEvents btnMostrar As Button
  Friend WithEvents btnCerrar As Button
End Class
