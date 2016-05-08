Public Class FormEsta

  Private Sub btnMostrar_Click(sender As Object, e As EventArgs) Handles btnMostrar.Click
    Dim Service As New NotaService()
    lblCant.Text = "Cant. Estudiantes: " & Service.cantEstudiantes()
    lblAprobados.Text = "Aprobados: " & Service.obtenerAprobados()
    lblDesaprobados.Text = "Desaprobados: " & Service.obtenerDesaprobados()
    lblPromedio.Text = "Nota Promedio: " & Service.obtenerPromedio()
  End Sub

End Class