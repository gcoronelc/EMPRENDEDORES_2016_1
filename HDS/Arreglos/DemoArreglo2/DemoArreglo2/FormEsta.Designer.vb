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
        Me.SuspendLayout()
        '
        'lblAprobados
        '
        Me.lblAprobados.AutoSize = True
        Me.lblAprobados.Location = New System.Drawing.Point(51, 45)
        Me.lblAprobados.Name = "lblAprobados"
        Me.lblAprobados.Size = New System.Drawing.Size(58, 13)
        Me.lblAprobados.TabIndex = 0
        Me.lblAprobados.Text = "Aprobados"
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
        'FormEsta
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(518, 282)
        Me.Controls.Add(Me.btnMostrar)
        Me.Controls.Add(Me.lblAprobados)
        Me.Name = "FormEsta"
        Me.Text = "FormEsta"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblAprobados As System.Windows.Forms.Label
    Friend WithEvents btnMostrar As System.Windows.Forms.Button
End Class
