Public Class FormListado

  Private Sub btnMostrarLista_Click(sender As Object, e As EventArgs) Handles btnMostrarLista.Click
    ' Obtener Lista
    Dim Service As New NotaService()
    Dim Notas() As Integer = Service.obtenerNotas()
    ' Proceso
    lbNotas.Items.Clear()
    For Each Nota As Integer In Notas
      lbNotas.Items.Add(Nota)
    Next
  End Sub

  Private Sub btnCerrar_Click(sender As Object, e As EventArgs) Handles btnCerrar.Click
    Me.Close()
  End Sub
End Class