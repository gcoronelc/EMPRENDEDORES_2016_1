
public List<Reporte> getReporte(int iscursoProg) {
   List<Reporte> lista = new ArrayList<>();


   CallableStatement cstm;
   csmt = cn.preparedCall("{call uspCCccc(?)}");
   csmt.setInt(1,idCursoPog);
   ResultSet rs = csmt.executeQuery();
   while( rs.next() ){
     Reporte bean = new Reporte();
	 bean.setConcepto(rs.getString("concepto"));
	 bean.setValor(rs.getString("valor"));
	 lista.add(bean);
   }   
   
   
   
   return lista;
}