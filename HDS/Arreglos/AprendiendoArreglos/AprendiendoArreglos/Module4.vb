Module Module4
    Sub Main()
        ' Arreglo de enteros
        Dim arreglo() As Long = {100, 300, 500, 900, 1000, 90}
        ' Usando bucle For
        Dim suma As Long = 0
        For i As Integer = 0 To arreglo.Length - 1
            Console.WriteLine(arreglo(i))
            suma = suma + arreglo(i)
        Next
        Console.WriteLine("Suma: " & suma)
        Console.WriteLine("Promedio: " & suma / arreglo.Length)
        Console.ReadLine()
    End Sub
End Module
