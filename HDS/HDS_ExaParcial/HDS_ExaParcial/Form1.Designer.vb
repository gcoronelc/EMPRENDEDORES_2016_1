<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
    Me.Label1 = New System.Windows.Forms.Label()
    Me.Label2 = New System.Windows.Forms.Label()
    Me.txtN = New System.Windows.Forms.TextBox()
    Me.txtM = New System.Windows.Forms.TextBox()
    Me.btnGenerar = New System.Windows.Forms.Button()
    Me.btnListado = New System.Windows.Forms.Button()
    Me.btnEstadistica = New System.Windows.Forms.Button()
    Me.btnSalir = New System.Windows.Forms.Button()
    Me.SuspendLayout()
    '
    'Label1
    '
    Me.Label1.AutoSize = True
    Me.Label1.Location = New System.Drawing.Point(69, 64)
    Me.Label1.Name = "Label1"
    Me.Label1.Size = New System.Drawing.Size(60, 13)
    Me.Label1.TabIndex = 0
    Me.Label1.Text = "Valor de N:"
    '
    'Label2
    '
    Me.Label2.AutoSize = True
    Me.Label2.Location = New System.Drawing.Point(69, 110)
    Me.Label2.Name = "Label2"
    Me.Label2.Size = New System.Drawing.Size(61, 13)
    Me.Label2.TabIndex = 1
    Me.Label2.Text = "Valor de M:"
    '
    'txtN
    '
    Me.txtN.Location = New System.Drawing.Point(156, 64)
    Me.txtN.Name = "txtN"
    Me.txtN.Size = New System.Drawing.Size(100, 20)
    Me.txtN.TabIndex = 2
    '
    'txtM
    '
    Me.txtM.Location = New System.Drawing.Point(156, 107)
    Me.txtM.Name = "txtM"
    Me.txtM.Size = New System.Drawing.Size(100, 20)
    Me.txtM.TabIndex = 3
    '
    'btnGenerar
    '
    Me.btnGenerar.Location = New System.Drawing.Point(301, 57)
    Me.btnGenerar.Name = "btnGenerar"
    Me.btnGenerar.Size = New System.Drawing.Size(149, 77)
    Me.btnGenerar.TabIndex = 4
    Me.btnGenerar.Text = "Generar"
    Me.btnGenerar.UseVisualStyleBackColor = True
    '
    'btnListado
    '
    Me.btnListado.Location = New System.Drawing.Point(72, 178)
    Me.btnListado.Name = "btnListado"
    Me.btnListado.Size = New System.Drawing.Size(122, 77)
    Me.btnListado.TabIndex = 5
    Me.btnListado.Text = "Listado"
    Me.btnListado.UseVisualStyleBackColor = True
    '
    'btnEstadistica
    '
    Me.btnEstadistica.Location = New System.Drawing.Point(200, 178)
    Me.btnEstadistica.Name = "btnEstadistica"
    Me.btnEstadistica.Size = New System.Drawing.Size(122, 77)
    Me.btnEstadistica.TabIndex = 6
    Me.btnEstadistica.Text = "Estadistica"
    Me.btnEstadistica.UseVisualStyleBackColor = True
    '
    'btnSalir
    '
    Me.btnSalir.Location = New System.Drawing.Point(328, 178)
    Me.btnSalir.Name = "btnSalir"
    Me.btnSalir.Size = New System.Drawing.Size(122, 77)
    Me.btnSalir.TabIndex = 7
    Me.btnSalir.Text = "Salir"
    Me.btnSalir.UseVisualStyleBackColor = True
    '
    'Form1
    '
    Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
    Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
    Me.ClientSize = New System.Drawing.Size(561, 331)
    Me.Controls.Add(Me.btnSalir)
    Me.Controls.Add(Me.btnEstadistica)
    Me.Controls.Add(Me.btnListado)
    Me.Controls.Add(Me.btnGenerar)
    Me.Controls.Add(Me.txtM)
    Me.Controls.Add(Me.txtN)
    Me.Controls.Add(Me.Label2)
    Me.Controls.Add(Me.Label1)
    Me.Name = "Form1"
    Me.Text = "EXAMEN PARCIAL"
    Me.ResumeLayout(False)
    Me.PerformLayout()

  End Sub

  Friend WithEvents Label1 As Label
  Friend WithEvents Label2 As Label
  Friend WithEvents txtN As TextBox
  Friend WithEvents txtM As TextBox
  Friend WithEvents btnGenerar As Button
  Friend WithEvents btnListado As Button
  Friend WithEvents btnEstadistica As Button
  Friend WithEvents btnSalir As Button
End Class
