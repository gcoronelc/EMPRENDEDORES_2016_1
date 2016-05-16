<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form3
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
    Me.lblMayor = New System.Windows.Forms.Label()
    Me.lblMenor = New System.Windows.Forms.Label()
    Me.lblPromedio = New System.Windows.Forms.Label()
    Me.btnCerrar = New System.Windows.Forms.Button()
    Me.btnMostrar = New System.Windows.Forms.Button()
    Me.SuspendLayout()
    '
    'lblMayor
    '
    Me.lblMayor.AutoSize = True
    Me.lblMayor.Location = New System.Drawing.Point(51, 45)
    Me.lblMayor.Name = "lblMayor"
    Me.lblMayor.Size = New System.Drawing.Size(39, 13)
    Me.lblMayor.TabIndex = 0
    Me.lblMayor.Text = "Label1"
    '
    'lblMenor
    '
    Me.lblMenor.AutoSize = True
    Me.lblMenor.Location = New System.Drawing.Point(51, 93)
    Me.lblMenor.Name = "lblMenor"
    Me.lblMenor.Size = New System.Drawing.Size(39, 13)
    Me.lblMenor.TabIndex = 1
    Me.lblMenor.Text = "Label1"
    '
    'lblPromedio
    '
    Me.lblPromedio.AutoSize = True
    Me.lblPromedio.Location = New System.Drawing.Point(51, 140)
    Me.lblPromedio.Name = "lblPromedio"
    Me.lblPromedio.Size = New System.Drawing.Size(39, 13)
    Me.lblPromedio.TabIndex = 2
    Me.lblPromedio.Text = "Label1"
    '
    'btnCerrar
    '
    Me.btnCerrar.Location = New System.Drawing.Point(253, 198)
    Me.btnCerrar.Name = "btnCerrar"
    Me.btnCerrar.Size = New System.Drawing.Size(155, 56)
    Me.btnCerrar.TabIndex = 3
    Me.btnCerrar.Text = "Cerrar"
    Me.btnCerrar.UseVisualStyleBackColor = True
    '
    'btnMostrar
    '
    Me.btnMostrar.Location = New System.Drawing.Point(54, 198)
    Me.btnMostrar.Name = "btnMostrar"
    Me.btnMostrar.Size = New System.Drawing.Size(155, 56)
    Me.btnMostrar.TabIndex = 4
    Me.btnMostrar.Text = "Mostrar"
    Me.btnMostrar.UseVisualStyleBackColor = True
    '
    'Form3
    '
    Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
    Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
    Me.ClientSize = New System.Drawing.Size(587, 318)
    Me.Controls.Add(Me.btnMostrar)
    Me.Controls.Add(Me.btnCerrar)
    Me.Controls.Add(Me.lblPromedio)
    Me.Controls.Add(Me.lblMenor)
    Me.Controls.Add(Me.lblMayor)
    Me.Name = "Form3"
    Me.Text = "ESTADISTICA"
    Me.ResumeLayout(False)
    Me.PerformLayout()

  End Sub

  Friend WithEvents lblMayor As Label
  Friend WithEvents lblMenor As Label
  Friend WithEvents lblPromedio As Label
  Friend WithEvents btnCerrar As Button
  Friend WithEvents btnMostrar As Button
End Class
