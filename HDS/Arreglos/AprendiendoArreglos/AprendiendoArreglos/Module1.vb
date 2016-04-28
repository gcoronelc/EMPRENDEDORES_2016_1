Module Module1

    Sub Main()
        ' Arreglo 
        Dim arreglo(4) As String
        arreglo(0) = "Chiclayo"
        arreglo(1) = "Trujillo"
        arreglo(2) = "Arequipa"
        arreglo(3) = CStr(2015)
        arreglo(4) = "Amazonas"


        ' Mostrar el arreglo 
        For Each elemento As String In arreglo
            Console.WriteLine(elemento)
        Next
        ' Pausa
        Console.ReadLine()
    End Sub

End Module
