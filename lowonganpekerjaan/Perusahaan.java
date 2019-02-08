package lowonganpekerjaan;

import java.util.ArrayList;

public class Perusahaan extends Orang{
	private ArrayList<Lowongan> daftarLowongan = new ArrayList<Lowongan>();
        private int idPerusahaan;
	private String namap;
	private int nLowongan=0;
	
	public Perusahaan(String namap, String nama, String tanggal, int id)
	{
            super(nama, tanggal);
            this.namap=namap;
            idPerusahaan=id;
	}
	
	public void createLowongan(Lowongan l)
	{
            daftarLowongan.add(l);
	}
	
	public Lowongan getLowonganidx(int idx)
	{
            return daftarLowongan.get(idx);
	}
	
	public Lowongan getLowonganid(int id)
	{
            Lowongan l = null;
            for (int i=0;i<daftarLowongan.size();i++){
                if (id==daftarLowongan.get(i).getId()){
                    l=daftarLowongan.get(i);
                }
            }
                return l;
	}
	
	public void removeLowongan(int id)
	{
            for (int i=0;i<daftarLowongan.size();i++){
                if (id==daftarLowongan.get(i).getId()){
                    daftarLowongan.remove(i);
                }
            }
	}	
		
	public int jmlPelamarMasuk(int id)
	{
		return daftarLowongan.get(id).jmlBerkasM();
	}
	
	public int jmlPelamarDiterima(int id)
	{
		return daftarLowongan.get(id).jmlBerkasD();
	}
	

        public int getId()
        {
            return idPerusahaan;
        }
        
        public String getNamaP()
        {
            return namap;
        }
        
        @Override
        public String getNama()
        {
            return super.getNama();
        }
        
        public int jumlahLowongan()
        {
            nLowongan=this.daftarLowongan.size();
            return nLowongan;
        }
        
        public ArrayList<Lowongan> getLowongan(){
            return daftarLowongan;
        }
        
        public void Shout()
        {
            System.out.println("");
        }
        public String DataPerusahaan(){
            return "Nama Perusahaan: "+getNamaP()+
                    "\nNama CEO: "+getNama()+
                    "\nID Perusahaan: "+getId()+
                    "\nTanggal Terdaftar: "+getTanggal();
        }
        
        public String IDPerusahaan(){
            return "ID Perusahaan: "+getId();
        }
}
