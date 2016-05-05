Public Class FormEsta

    Private Sub btnMostrar_Click(sender As Object, e As EventArgs) Handles btnMostrar.Click
        Dim Service As New NotaService()

        lblAprobados.Text = "Aprobados: " & Service.obtenerAprobados()


    End Sub
End Class