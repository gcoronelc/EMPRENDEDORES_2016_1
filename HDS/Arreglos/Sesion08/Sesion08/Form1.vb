Public Class Form1
    'Creando un arreglo global,para ser llamado en cualquier parte
    'del formulario
    Dim numeros(9) As Integer 'numeros de 0 to 9
    Private Sub btnGenerar_Click(sender As Object, e As EventArgs) Handles btnGenerar.Click
        'GetUpperBound(dimension)=> retorna el maximo indice del arreglo
        Dim sn As String = ""
        Dim sw As Boolean = False 'Boolean (False,True)
        Dim n As Integer = 0
        For i As Integer = 0 To numeros.GetUpperBound(0)
            sw = True
            While sw = True 'Instruccion repetitiva
                n = Rnd() * 100 'Generando un numero aleatorio
                'recorriendo el arreglo,buscando el numero repetido
                For j As Integer = 0 To numeros.GetUpperBound(0)
                    'preguntando si el numero del arreglo es igual al
                    'numero generado
                    If numeros(j) = n Then
                        sw = True 'si el numero se ha encontrado
                        Exit For 'salir del For
                    Else 'si no se ha encontrado el numero
                        sw = False
                    End If
                Next
            End While
            numeros(i) = n 'Generando numero de 0 a 100
            'Rnd => 0.01 hasta 0.99
            sn = sn & numeros(i) & ","  ' 10,20,30,
        Next 'Alineando el texto para el centro
        txtNumero.TextAlign = HorizontalAlignment.Center
        txtNumero.Text = sn
    End Sub
    Private Sub btnPares_Click(sender As Object, e As EventArgs) Handles btnPares.Click
        LSTPARES.Items.Clear() 'Limpiando el control ListBox
        For i As Integer = 0 To numeros.GetUpperBound(0)
            'buscando si el numero es divisible
            If numeros(i) Mod 2 = 0 Then
                LSTPARES.Items.Add(numeros(i))
            End If
        Next
        txtPares.Text = LSTPARES.Items.Count
    End Sub
    Private Sub btnDivisor_Click(sender As Object, e As EventArgs) Handles btnDivisor.Click
        'Ingresar un divisor
        Dim divisor As Integer = CInt(InputBox("Ingrese un Divisor"))
        LSTDIVISORES.Items.Clear() 'Limpiando el control ListBox
        For i As Integer = 0 To numeros.GetUpperBound(0)
            'buscando si el numero es divisible
            If numeros(i) Mod divisor = 0 Then
                LSTDIVISORES.Items.Add(numeros(i))
            End If
        Next
        txtDivisor.Text = LSTDIVISORES.Items.Count
    End Sub
End Class
