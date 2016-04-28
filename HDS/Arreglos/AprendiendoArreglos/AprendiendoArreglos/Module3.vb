Module Module3
    Sub Main()
        ' Crea e inicializa un arreglo
        Dim arreglo() As String = {"Java", "VB.NET", "C#", "PHP"}

        ' Acceso mediante el índice
        Console.WriteLine("Acceso mediante el índice")
        Console.WriteLine(arreglo(0))
        Console.WriteLine(arreglo(2))

        ' Utilizando el indice
        Console.WriteLine("Utilizando el índice")
        Dim i = 0
        Do While (i < arreglo.Length)
            Console.WriteLine(arreglo(i))
            i += 1
        Loop
        Console.ReadLine()
    End Sub
End Module
