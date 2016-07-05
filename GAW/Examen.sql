update asignado set dtt_asigfechabaja = sysdate()
where chr_asigcodigo = '000008';

insert into asignado(chr_asigcodigo,chr_sucucodigo,
chr_emplcodigo,dtt_asigfechaalta)
values('000012','004','0008',DATE_ADD(sysdate(), INTERVAL 1 DAY));

select vch_monedescripcion MONEDA,
sum(case when tm.vch_tipoaccion = 'INGRESO' 
         then mov.dec_moviimporte else 0 end) INGRESO,
sum(case when tm.vch_tipoaccion = 'SALIDA' 
         then mov.dec_moviimporte else 0 end) SALIDA		 
from moneda mon
join cuenta c on mon.chr_monecodigo = c.chr_monecodigo
join movimiento mov on c.chr_cuencodigo = mov.chr_cuencodigo
join tipomovimiento tm on mov.chr_tipocodigo = tm.chr_tipocodigo
group by mon.vch_monedescripcion;