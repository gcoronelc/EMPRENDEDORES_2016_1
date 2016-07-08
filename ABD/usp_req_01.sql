alter procedure usp_req_01(@id int)
as
begin
  -- Variables
  declare @idCurso varchar(10), @NomCurso varchar(50),
    @cont int, @idTarifa varchar(5), @PagoHora money,
    @horas int, @PagoProfesor money;
  -- Validación
  select @cont = count(*) from CursoProgramado where IdCursoProg = @id;
  if( @cont = 0)
  begin
    print 'Curso no existe';
    return;
  end;
  -- Lectura
  select @idCurso = c.IdCurso, @NomCurso = NomCurso, @idTarifa = IdTarifa
  from curso c 
  join CursoProgramado cp on c.IdCurso = cp.IdCurso
  where cp.IdCursoProg = @id;

  select @horas = Horas, @PagoHora = PagoHora
  from tarifa where IdTarifa = @idTarifa;


  -- Proceso
  set @PagoProfesor = @horas * @PagoHora;

  -- Reporte
  print 'Nombre de curso: ' + @NomCurso;
  print 'Profesor: ' ;
  print 'Horas: ' + cast(@Horas as varchar);
  print 'Pago por horas: ' + cast(@PagoHora as varchar);
  print 'Pago Profesor: ' + cast(@PagoProfesor as varchar);
end;
go

exec usp_reg_01 6789;
go
