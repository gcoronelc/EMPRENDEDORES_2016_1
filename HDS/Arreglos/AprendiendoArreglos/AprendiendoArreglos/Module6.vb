Module Module6

    Sub Main()
        Dim lista() As Integer = generaVector(10)
        lista = generaVector(3)
        Console.WriteLine("Tamaño: " & lista.Length)
        For Each n In lista
            Console.WriteLine(n)
        Next
        Console.ReadLine()
    End Sub


    ' Genera un arreglo 
    Function generaVector(n As Integer) As Integer()
        Dim arreglo(n - 1) As Integer
        For i As Integer = 0 To arreglo.Length - 1
            arreglo(i) = CInt(Rnd() * 50)
        Next
        Return arreglo
    End Function
End Module
