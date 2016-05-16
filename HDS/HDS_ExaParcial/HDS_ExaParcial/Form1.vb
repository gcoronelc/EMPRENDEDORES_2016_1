Public Class Form1
  Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
    Me.Close()
  End Sub

  Private Sub btnGenerar_Click(sender As Object, e As EventArgs) Handles btnGenerar.Click
    ' Datos
    Dim N As Integer = CInt(txtN.Text)
    Dim M As Integer = CInt(txtM.Text)
    ' Verifica
    If (N >= M) Then
      MessageBox.Show("El valor de N debe ser menor que el valor de M")
      Return
    End If
    ' Proceso
    Dim Service As EPService = New EPService()
    Service.Generar(N, M)
  End Sub

  Private Sub btnListado_Click(sender As Object, e As EventArgs) Handles btnListado.Click
    Dim formListado As Form2 = New Form2()
    formListado.ShowDialog()
  End Sub

  Private Sub btnEstadistica_Click(sender As Object, e As EventArgs) Handles btnEstadistica.Click
    Dim formEstadistica As Form3 = New Form3()
    formEstadistica.ShowDialog()
  End Sub
End Class
