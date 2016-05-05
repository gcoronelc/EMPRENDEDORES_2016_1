Public Class Form1

    Private Sub btnAgregar_Click(sender As Object, e As EventArgs) Handles btnAgregar.Click
        ' dato
        Dim nota As Integer
        nota = Val(txtNota.Text)
        ' proceso
        Dim Service As New NotaService()
        Service.AgregarNota(nota)
        txtNota.Text = ""
    End Sub

    Private Sub btnListado_Click(sender As Object, e As EventArgs) Handles btnListado.Click
        Dim panchito As New FormListado()
        panchito.ShowDialog()
    End Sub


    Private Sub btnEstadistica_Click(sender As Object, e As EventArgs) Handles btnEstadistica.Click
        Dim panchito As New FormEsta()
        panchito.ShowDialog()
    End Sub
End Class
