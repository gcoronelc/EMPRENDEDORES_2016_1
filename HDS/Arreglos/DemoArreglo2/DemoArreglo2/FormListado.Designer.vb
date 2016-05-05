<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FormListado
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
        Me.lvLista = New System.Windows.Forms.ListView()
        Me.btnMostrarLista = New System.Windows.Forms.Button()
        Me.btnCerrar = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lvLista
        '
        Me.lvLista.Location = New System.Drawing.Point(30, 12)
        Me.lvLista.Name = "lvLista"
        Me.lvLista.Size = New System.Drawing.Size(121, 218)
        Me.lvLista.TabIndex = 0
        Me.lvLista.UseCompatibleStateImageBehavior = False
        '
        'btnMostrarLista
        '
        Me.btnMostrarLista.Location = New System.Drawing.Point(236, 30)
        Me.btnMostrarLista.Name = "btnMostrarLista"
        Me.btnMostrarLista.Size = New System.Drawing.Size(75, 23)
        Me.btnMostrarLista.TabIndex = 1
        Me.btnMostrarLista.Text = "Mostrar Lista"
        Me.btnMostrarLista.UseVisualStyleBackColor = True
        '
        'btnCerrar
        '
        Me.btnCerrar.Location = New System.Drawing.Point(236, 80)
        Me.btnCerrar.Name = "btnCerrar"
        Me.btnCerrar.Size = New System.Drawing.Size(75, 23)
        Me.btnCerrar.TabIndex = 2
        Me.btnCerrar.Text = "Cerrar"
        Me.btnCerrar.UseVisualStyleBackColor = True
        '
        'FormListado
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(409, 262)
        Me.Controls.Add(Me.btnCerrar)
        Me.Controls.Add(Me.btnMostrarLista)
        Me.Controls.Add(Me.lvLista)
        Me.Name = "FormListado"
        Me.Text = "FormListado"
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents lvLista As System.Windows.Forms.ListView
    Friend WithEvents btnMostrarLista As System.Windows.Forms.Button
    Friend WithEvents btnCerrar As System.Windows.Forms.Button
End Class
