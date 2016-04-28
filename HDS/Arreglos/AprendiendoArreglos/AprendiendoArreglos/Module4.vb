Module Module4
    Sub Main()
        ' Arreglo de enteros
        Dim arreglo() As Long = {100, 300, 500, 900, 1000, 100110000000}
        ' Usando bucle For
        For i As Integer = 0 To arreglo.Length - 1
            Console.WriteLine(arreglo(i))
        Next
        Console.ReadLine()
    End Sub
End Module
