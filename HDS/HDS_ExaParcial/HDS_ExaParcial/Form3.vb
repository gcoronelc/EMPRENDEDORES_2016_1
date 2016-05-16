Public Class Form3
  Private Sub btnCerrar_Click(sender As Object, e As EventArgs) Handles btnCerrar.Click
    Me.Close()
  End Sub

  Private Sub btnMostrar_Click(sender As Object, e As EventArgs) Handles btnMostrar.Click
    Dim Service As EPService = New EPService()
    lblMayor.Text = "El número mayor es: " & Service.getMayor()
    lblMenor.Text = "El número menor es: " & Service.GetMenor()
    lblPromedio.Text = "El valor promedio es: " & Service.GetPromedio()
  End Sub
End Class