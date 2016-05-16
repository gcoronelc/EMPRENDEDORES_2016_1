Public Class Form2
  Private Sub btnCerrar_Click(sender As Object, e As EventArgs) Handles btnCerrar.Click
    Me.Close()
  End Sub

  Private Sub btnMostrar_Click(sender As Object, e As EventArgs) Handles btnMostrar.Click
    lstDatos.Items.Clear()
    Dim Service As EPService = New EPService()
    For Each Valor As Integer In Service.getLista()
      lstDatos.Items.Add(Valor)
    Next
  End Sub
End Class