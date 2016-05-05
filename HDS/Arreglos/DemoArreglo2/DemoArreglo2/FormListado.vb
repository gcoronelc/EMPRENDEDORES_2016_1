Public Class FormListado

    Private Sub btnMostrarLista_Click(sender As Object, e As EventArgs) Handles btnMostrarLista.Click
        ' Obtener Lista
        Dim Service As New NotaService()
        Dim Notas() As Integer = Service.obtenerNotas()
        ' Proceso
        For Each Nota As Integer In Notas
            lvLista.Items.Add(Nota)
        Next

    End Sub
End Class