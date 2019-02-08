package lowonganpekerjaan;

public abstract class Orang
{
	private String nama;
	private String tanggal;
	
	public Orang(String nama,String tanggal)
	{
		setNama(nama);
		setTanggal(tanggal);
	}
        
	public String getNama()
	{
		return nama;
	}
	public String getTanggal()
	{
		return tanggal;
	}
	public void setNama(String nama)
	{
		this.nama=nama;
	}
	public void setTanggal(String tanggal)
	{
		this.tanggal=tanggal;
	}
}