Public Class Form1


    Private Sub btnAgregar_Click(sender As Object, e As EventArgs) Handles btnAgregar.Click
        ' Variables
        Dim Service As New NotasService()
        Dim Nota As Integer
        ' Datos
        Nota = Val(txtNota.Text)
        ' Proceso
        Service.AgregarNota(Nota)
        txtNota.Text = ""
    End Sub

    Private Sub btnListado_Click(sender As Object, e As EventArgs) Handles btnListado.Click
        Dim formListado = New FormListado()
        formListado.ShowDialog()
    End Sub
End Class
