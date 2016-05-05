Public Class FormListado

    Private Sub btnCargarLista_Click(sender As Object, e As EventArgs) Handles btnCargarLista.Click

        ' Obtener lista de notas
        Dim Service As New NotasService()
        Dim Notas() As Integer = Service.ObtenerNotas()

        ' Limpiar lista del ListView
        lista.Items.Clear()

        ' Cargar notas al ListView
        For Each Nota As Integer In Notas
            lista.Items.Add(Nota)
        Next

    End Sub
End Class