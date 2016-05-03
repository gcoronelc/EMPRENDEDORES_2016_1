Public Class NotasService


    Sub AgregarNota(ByVal nota As Integer)
        Data.Notas(Data.Cont) = nota
        Data.Cont = Data.Cont + 1
    End Sub

    Function ObtenerNotas() As Integer()
        Dim Notas2(Data.Cont - 1) As Integer
        For i As Integer = 0 To Data.Cont - 1
            Notas2(0) = Data.Notas(i)
        Next
        Return Notas2
    End Function

End Class
