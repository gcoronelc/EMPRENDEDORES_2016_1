alter procedure usp_req01v2(@id int)
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
  create table #reporte(
    concepto varchar(60) null,
    valor varchar(50) null
  );

  insert into #reporte values('Nombre de curso: ',@NomCurso);
  insert into #reporte values('Profesor: ','None');
  insert into #reporte values('Horas: ',cast(@Horas as varchar));
  insert into #reporte values('Pago por horas: ',cast(@PagoHora as varchar));
  insert into #reporte values('Pago Profesor: ', cast(@PagoProfesor as varchar));

  select concepto, valor from #reporte;
end;
go

exec usp_req01v2 6789;
go
