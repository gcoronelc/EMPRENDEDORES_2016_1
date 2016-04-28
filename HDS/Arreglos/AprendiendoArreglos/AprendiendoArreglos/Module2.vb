Module Module2

    Sub Main()
        ' Crea e inicializa un arreglo
        Dim arreglo() As String = {"Coca Cola", "Inca Kola", "Pepsi cola", "Kola Real", "Guarana"}
        ' Mostrar el arreglo
        Console.WriteLine("Tamaño: " & arreglo.Length)
        For Each value As String In arreglo
            Console.WriteLine(value)
        Next
        Console.ReadLine()
    End Sub
End Module
