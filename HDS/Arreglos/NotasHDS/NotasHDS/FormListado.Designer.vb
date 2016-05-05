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
        Me.lista = New System.Windows.Forms.ListView()
        Me.btnCerrar = New System.Windows.Forms.Button()
        Me.btnCargarLista = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lista
        '
        Me.lista.Location = New System.Drawing.Point(27, 23)
        Me.lista.Name = "lista"
        Me.lista.Size = New System.Drawing.Size(121, 215)
        Me.lista.TabIndex = 0
        Me.lista.UseCompatibleStateImageBehavior = False
        '
        'btnCerrar
        '
        Me.btnCerrar.Location = New System.Drawing.Point(205, 136)
        Me.btnCerrar.Name = "btnCerrar"
        Me.btnCerrar.Size = New System.Drawing.Size(153, 64)
        Me.btnCerrar.TabIndex = 1
        Me.btnCerrar.Text = "Cerrar"
        Me.btnCerrar.UseVisualStyleBackColor = True
        '
        'btnCargarLista
        '
        Me.btnCargarLista.Location = New System.Drawing.Point(205, 36)
        Me.btnCargarLista.Name = "btnCargarLista"
        Me.btnCargarLista.Size = New System.Drawing.Size(153, 69)
        Me.btnCargarLista.TabIndex = 2
        Me.btnCargarLista.Text = "Cargar Lista"
        Me.btnCargarLista.UseVisualStyleBackColor = True
        '
        'FormListado
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(419, 262)
        Me.Controls.Add(Me.btnCargarLista)
        Me.Controls.Add(Me.btnCerrar)
        Me.Controls.Add(Me.lista)
        Me.Name = "FormListado"
        Me.Text = "LISTADO DE NOTAS"
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents lista As System.Windows.Forms.ListView
    Friend WithEvents btnCerrar As System.Windows.Forms.Button
    Friend WithEvents btnCargarLista As System.Windows.Forms.Button
End Class
