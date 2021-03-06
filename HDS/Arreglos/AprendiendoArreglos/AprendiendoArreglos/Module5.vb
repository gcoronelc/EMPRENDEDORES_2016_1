﻿Module Module5

    ' Arreglo como parámetro 
    Sub Main()
        Dim arreglo() As Integer = {5, 10, 20, 80, 70}
        Console.WriteLine("Arreglo: " + arregloACadena(arreglo))
        Console.WriteLine("Suma: " + calcSuma(arreglo).ToString)
        Console.WriteLine("Mayor: " + obtenerMayor(arreglo).ToString)
        Console.ReadLine()
    End Sub

    Function arregloACadena(ByRef lista() As Integer) As String
        Dim cadena As String = ""
        For Each elemento As String In lista
            cadena = cadena & elemento & " "
        Next
        Return cadena
    End Function

    ' Función que retorn la suma 
    Function calcSuma(ByVal lista() As Integer) As Integer
        Dim suma As Integer = 0
        For i As Integer = 0 To lista.Length - 1
            suma += lista(i)
        Next
        Return suma
    End Function

    ' Función que retorna el mayor
    Function obtenerMayor(ByRef lista() As Integer) As Integer
        Dim mayor As Integer = lista(0)
        For i As Integer = 1 To lista.Length - 1
            If mayor < lista(i) Then
                mayor = lista(i)
            End If
        Next
        Return mayor
    End Function

End Module
