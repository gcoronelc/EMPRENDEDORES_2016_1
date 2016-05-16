Public Class EPService

  Public Sub Generar(ByVal N As Integer, ByVal M As Integer)
    For i As Integer = 0 To 9
      Data.Datos(i) = CInt(Rnd() * (M - N) + N)
    Next
  End Sub

  Public Function GetLista() As Integer()
    Return Data.Datos
  End Function

  Public Function getMayor() As Integer
    Dim Service As EPService = New EPService()
    Dim Mayor As Integer = Data.Datos(0)
    For Each Valor As Integer In Data.Datos
      If (Mayor < Valor) Then
        Mayor = Valor
      End If
    Next
    Return Mayor
  End Function

  Public Function GetMenor() As Integer
    Dim Service As EPService = New EPService()
    Dim Menor As Integer = Data.Datos(0)
    For Each Valor As Integer In Data.Datos
      If (Menor > Valor) Then
        Menor = Valor
      End If
    Next
    Return Menor
  End Function

  Public Function GetPromedio() As Integer
    Dim Suma As Integer = 0
    For Each Valor As Integer In Data.Datos
      Suma += Valor
    Next
    Dim Promedio = Suma / Data.Datos.Length
    Return Promedio
  End Function
End Class
