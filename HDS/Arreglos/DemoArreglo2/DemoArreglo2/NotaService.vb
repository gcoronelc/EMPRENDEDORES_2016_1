Public Class NotaService

    Sub AgregarNota(ByVal Nota As Integer)
        Datos.Notas(Datos.Cont) = Nota
        Datos.Cont = Datos.Cont + 1
    End Sub

    Function obtenerNotas() As Integer()
        Dim NotasAux(Datos.Cont - 1) As Integer
        For i As Integer = 0 To Datos.Cont - 1
            NotasAux(i) = Datos.Notas(i)
        Next
        Return NotasAux
    End Function

    Function obtenerAprobados() As Integer
        Dim Cont As Integer = 0
        For Each nota As Integer In obtenerNotas()
            If (nota >= 13) Then
                Cont = Cont + 1
            End If
        Next
        Return Cont
    End Function

    Function obtenerPromedio() As Integer
        Dim suma As Integer = 0
        For Each nota As Integer In obtenerNotas()
            suma = suma + nota
        Next
        Return suma / obtenerNotas().Length
    End Function


End Class
