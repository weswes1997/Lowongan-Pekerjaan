package lowonganpekerjaan;

public class Pelamar extends Orang{
	private BerkasLamaran berkas;
        private int idPelamar;
        private String pengalaman;

	public Pelamar(String nama, String tanggal, int idPelamar, BerkasLamaran bl,String pengalaman){
            super(nama, tanggal);
            this.idPelamar = idPelamar;
            berkas = bl;
            this.pengalaman = pengalaman;
	}
                
	public void createBerkas(BerkasLamaran bl){
            berkas = bl;
	}
        
        public BerkasLamaran getBerkas()
	{
            return berkas;
	}
        
        public int getId()
        {
            return idPelamar;
        }
        public String getPengalaman(){
            return pengalaman;
        }
        
        public String DataPelamar(){
            return "Nama Pelamar: "+getNama()+                 
                    "\nID Pelamar: "+getId()+
                    "\nTanggal Mendaftar: "+getTanggal()+
                    getBerkas().toString();
        }
}
