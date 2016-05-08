<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FormEsta
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
    Me.lblAprobados = New System.Windows.Forms.Label()
    Me.btnMostrar = New System.Windows.Forms.Button()
    Me.lblDesaprobados = New System.Windows.Forms.Label()
    Me.lblPromedio = New System.Windows.Forms.Label()
    Me.lblCant = New System.Windows.Forms.Label()
    Me.SuspendLayout()
    '
    'lblAprobados
    '
    Me.lblAprobados.AutoSize = True
    Me.lblAprobados.Location = New System.Drawing.Point(50, 86)
    Me.lblAprobados.Name = "lblAprobados"
    Me.lblAprobados.Size = New System.Drawing.Size(61, 13)
    Me.lblAprobados.TabIndex = 0
    Me.lblAprobados.Text = "Aprobados:"
    '
    'btnMostrar
    '
    Me.btnMostrar.Location = New System.Drawing.Point(324, 59)
    Me.btnMostrar.Name = "btnMostrar"
    Me.btnMostrar.Size = New System.Drawing.Size(75, 23)
    Me.btnMostrar.TabIndex = 1
    Me.btnMostrar.Text = "Mostrar"
    Me.btnMostrar.UseVisualStyleBackColor = True
    '
    'lblDesaprobados
    '
    Me.lblDesaprobados.AutoSize = True
    Me.lblDesaprobados.Location = New System.Drawing.Point(50, 127)
    Me.lblDesaprobados.Name = "lblDesaprobados"
    Me.lblDesaprobados.Size = New System.Drawing.Size(79, 13)
    Me.lblDesaprobados.TabIndex = 2
    Me.lblDesaprobados.Text = "Desaprobados:"
    '
    'lblPromedio
    '
    Me.lblPromedio.AutoSize = True
    Me.lblPromedio.Location = New System.Drawing.Point(50, 169)
    Me.lblPromedio.Name = "lblPromedio"
    Me.lblPromedio.Size = New System.Drawing.Size(80, 13)
    Me.lblPromedio.TabIndex = 3
    Me.lblPromedio.Text = "Nota Promedio:"
    '
    'lblCant
    '
    Me.lblCant.AutoSize = True
    Me.lblCant.Location = New System.Drawing.Point(50, 50)
    Me.lblCant.Name = "lblCant"
    Me.lblCant.Size = New System.Drawing.Size(93, 13)
    Me.lblCant.TabIndex = 4
    Me.lblCant.Text = "Cant. Estudiantes:"
    '
    'FormEsta
    '
    Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
    Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
    Me.ClientSize = New System.Drawing.Size(518, 282)
    Me.Controls.Add(Me.lblCant)
    Me.Controls.Add(Me.lblPromedio)
    Me.Controls.Add(Me.lblDesaprobados)
    Me.Controls.Add(Me.btnMostrar)
    Me.Controls.Add(Me.lblAprobados)
    Me.Name = "FormEsta"
    Me.Text = "FormEsta"
    Me.ResumeLayout(False)
    Me.PerformLayout()

  End Sub
  Friend WithEvents lblAprobados As System.Windows.Forms.Label
    Friend WithEvents btnMostrar As System.Windows.Forms.Button
  Friend WithEvents lblDesaprobados As Label
  Friend WithEvents lblPromedio As Label
  Friend WithEvents lblCant As Label
End Class
