update asignado set dtt_asigfechabaja = sysdate()
where chr_asigcodigo = '000008';

insert into asignado(chr_asigcodigo,chr_sucucodigo,
chr_emplcodigo,dtt_asigfechaalta)
values('000012','004','0008',DATE_ADD(sysdate(), INTERVAL 1 DAY));

