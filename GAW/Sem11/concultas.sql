-- consulta 01
-- ===========

select chr_cuencodigo, chr_monecodigo, chr_sucucodigo, 
chr_emplcreacuenta, chr_cliecodigo, dec_cuensaldo, 
dtt_cuenfechacreacion, vch_cuenestado, int_cuencontmov, 
chr_cuenclave from cuenta 

-- Consulta 02
Por sucursal se necesita un resumen de sus
cuentas.
/*

CUENTA        INGRESOS    SALIDAS   SALDO
------------------------------------------
00100001       5000.00    3000.00   2000.00
00100002       7890.00    2460.00   ####.##
....
....
-------------------------------------------
*/

-- Movimiento
chr_cuencodigo
int_movinumero
dtt_movifecha
chr_emplcodigo
chr_tipocodigo
dec_moviimporte
chr_cuenreferencia
-- TipoMovimiento
chr_tipocodigo
vch_tipodescripcion
vch_tipoaccion
vch_tipoestado

-- Parte 1
select 
	m.chr_cuencodigo AS cuenta,
	tm.vch_tipoaccion,
	m.dec_moviimporte
from tipomovimiento tm
join movimiento m on tm.chr_tipocodigo = m.chr_tipocodigo
join cuenta c on m.chr_cuencodigo = c.chr_cuencodigo
where c.chr_sucucodigo = '001';

-- Parte 2
select 
	m.chr_cuencodigo AS cuenta,
	tm.vch_tipoaccion,
	m.dec_moviimporte,
	m.dec_moviimporte * case when tm.vch_tipoaccion='SALIDA' 
		then -1 else 1 end as importe2
from tipomovimiento tm
join movimiento m on tm.chr_tipocodigo = m.chr_tipocodigo
join cuenta c on m.chr_cuencodigo = c.chr_cuencodigo
where c.chr_sucucodigo = '001';









select 
	m.chr_cuencodigo AS cuenta,
	sum(case when tm.vch_tipoaccion='INGRESO' 
		then dec_moviimporte else 0 end) as ingreso,
	sum(case when tm.vch_tipoaccion='SALIDA' 
		then dec_moviimporte else 0 end) as salida,
	sum(dec_moviimporte * case when tm.vch_tipoaccion='SALIDA' 
		then -1 else 1 end) as saldo
from tipomovimiento tm
join movimiento m on tm.chr_tipocodigo = m.chr_tipocodigo
join cuenta c on m.chr_cuencodigo = c.chr_cuencodigo
where c.chr_sucucodigo = '001'
group by m.chr_cuencodigo;














-- Consulta 03
-- Consultar los movimientos de una cuenta


