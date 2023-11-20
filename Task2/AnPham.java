package Task2;

import java.util.Objects;

public class AnPham {
	protected String tenSach;
	protected int soTrang;
	protected int nam;
	protected String tacGia;
	protected int gia;

	public AnPham(String tenSach, int soTrang, int nam, String tacGia, int gia) {
		super();
		this.tenSach = tenSach;
		this.soTrang = soTrang;
		this.nam = nam;
		this.tacGia = tacGia;
		this.gia = gia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int hashCode() {
		return Objects.hash(gia, nam, soTrang, tacGia, tenSach);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnPham other = (AnPham) obj;
		return gia == other.gia && nam == other.nam && soTrang == other.soTrang && Objects.equals(tacGia, other.tacGia)
				&& Objects.equals(tenSach, other.tenSach);
	}

}
