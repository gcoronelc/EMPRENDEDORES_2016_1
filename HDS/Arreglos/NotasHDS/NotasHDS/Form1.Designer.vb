﻿<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
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
        Me.txtNota = New System.Windows.Forms.TextBox()
        Me.btnAgregar = New System.Windows.Forms.Button()
        Me.btnListado = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(41, 35)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(30, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Nota"
        '
        'txtNota
        '
        Me.txtNota.Location = New System.Drawing.Point(44, 52)
        Me.txtNota.Name = "txtNota"
        Me.txtNota.Size = New System.Drawing.Size(100, 20)
        Me.txtNota.TabIndex = 1
        '
        'btnAgregar
        '
        Me.btnAgregar.Location = New System.Drawing.Point(206, 35)
        Me.btnAgregar.Name = "btnAgregar"
        Me.btnAgregar.Size = New System.Drawing.Size(143, 40)
        Me.btnAgregar.TabIndex = 2
        Me.btnAgregar.Text = "Agregar"
        Me.btnAgregar.UseVisualStyleBackColor = True
        '
        'btnListado
        '
        Me.btnListado.Location = New System.Drawing.Point(44, 137)
        Me.btnListado.Name = "btnListado"
        Me.btnListado.Size = New System.Drawing.Size(153, 74)
        Me.btnListado.TabIndex = 3
        Me.btnListado.Text = "Listado"
        Me.btnListado.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(510, 310)
        Me.Controls.Add(Me.btnListado)
        Me.Controls.Add(Me.btnAgregar)
        Me.Controls.Add(Me.txtNota)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents txtNota As System.Windows.Forms.TextBox
    Friend WithEvents btnAgregar As System.Windows.Forms.Button
    Friend WithEvents btnListado As System.Windows.Forms.Button

End Class
