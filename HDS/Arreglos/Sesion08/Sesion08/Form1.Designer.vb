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
        Me.btnGenerar = New System.Windows.Forms.Button()
        Me.txtNumero = New System.Windows.Forms.TextBox()
        Me.btnPares = New System.Windows.Forms.Button()
        Me.btnDivisor = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.LSTPARES = New System.Windows.Forms.ListBox()
        Me.LSTDIVISORES = New System.Windows.Forms.ListBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtPares = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtDivisor = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'btnGenerar
        '
        Me.btnGenerar.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnGenerar.Location = New System.Drawing.Point(62, 12)
        Me.btnGenerar.Name = "btnGenerar"
        Me.btnGenerar.Size = New System.Drawing.Size(409, 32)
        Me.btnGenerar.TabIndex = 0
        Me.btnGenerar.Text = "Generando numeros aleatorios  en un arreglo"
        Me.btnGenerar.UseVisualStyleBackColor = True
        '
        'txtNumero
        '
        Me.txtNumero.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtNumero.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtNumero.Location = New System.Drawing.Point(80, 50)
        Me.txtNumero.Name = "txtNumero"
        Me.txtNumero.Size = New System.Drawing.Size(373, 26)
        Me.txtNumero.TabIndex = 1
        '
        'btnPares
        '
        Me.btnPares.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnPares.Location = New System.Drawing.Point(62, 88)
        Me.btnPares.Name = "btnPares"
        Me.btnPares.Size = New System.Drawing.Size(163, 27)
        Me.btnPares.TabIndex = 2
        Me.btnPares.Text = "Ver Numeros Pares"
        Me.btnPares.UseVisualStyleBackColor = True
        '
        'btnDivisor
        '
        Me.btnDivisor.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDivisor.Location = New System.Drawing.Point(290, 88)
        Me.btnDivisor.Name = "btnDivisor"
        Me.btnDivisor.Size = New System.Drawing.Size(161, 27)
        Me.btnDivisor.TabIndex = 3
        Me.btnDivisor.Text = "Ingrese un Divisor"
        Me.btnDivisor.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(55, 121)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(170, 16)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Lista de numeros pares"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(303, 121)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(154, 16)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "Numero de Divisores"
        '
        'LSTPARES
        '
        Me.LSTPARES.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.LSTPARES.FormattingEnabled = True
        Me.LSTPARES.ItemHeight = 20
        Me.LSTPARES.Location = New System.Drawing.Point(58, 141)
        Me.LSTPARES.Name = "LSTPARES"
        Me.LSTPARES.Size = New System.Drawing.Size(200, 124)
        Me.LSTPARES.TabIndex = 6
        '
        'LSTDIVISORES
        '
        Me.LSTDIVISORES.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.LSTDIVISORES.FormattingEnabled = True
        Me.LSTDIVISORES.ItemHeight = 20
        Me.LSTDIVISORES.Location = New System.Drawing.Point(283, 141)
        Me.LSTDIVISORES.Name = "LSTDIVISORES"
        Me.LSTDIVISORES.Size = New System.Drawing.Size(203, 124)
        Me.LSTDIVISORES.TabIndex = 7
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(55, 275)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(133, 16)
        Me.Label3.TabIndex = 8
        Me.Label3.Text = "Numero de Items :"
        '
        'txtPares
        '
        Me.txtPares.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtPares.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtPares.Location = New System.Drawing.Point(190, 273)
        Me.txtPares.Name = "txtPares"
        Me.txtPares.Size = New System.Drawing.Size(55, 22)
        Me.txtPares.TabIndex = 9
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(287, 275)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(133, 16)
        Me.Label4.TabIndex = 10
        Me.Label4.Text = "Numero de Items :"
        '
        'txtDivisor
        '
        Me.txtDivisor.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtDivisor.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtDivisor.Location = New System.Drawing.Point(426, 273)
        Me.txtDivisor.Name = "txtDivisor"
        Me.txtDivisor.Size = New System.Drawing.Size(60, 22)
        Me.txtDivisor.TabIndex = 11
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(520, 311)
        Me.Controls.Add(Me.txtDivisor)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtPares)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.LSTDIVISORES)
        Me.Controls.Add(Me.LSTPARES)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnDivisor)
        Me.Controls.Add(Me.btnPares)
        Me.Controls.Add(Me.txtNumero)
        Me.Controls.Add(Me.btnGenerar)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnGenerar As System.Windows.Forms.Button
    Friend WithEvents txtNumero As System.Windows.Forms.TextBox
    Friend WithEvents btnPares As System.Windows.Forms.Button
    Friend WithEvents btnDivisor As System.Windows.Forms.Button
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents LSTPARES As System.Windows.Forms.ListBox
    Friend WithEvents LSTDIVISORES As System.Windows.Forms.ListBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtPares As System.Windows.Forms.TextBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents txtDivisor As System.Windows.Forms.TextBox

End Class
