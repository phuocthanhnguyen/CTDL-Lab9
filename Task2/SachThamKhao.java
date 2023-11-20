package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SachThamKhao extends AnPham {
	private String linhVuc;
	private List<Chuong> dsChuongSach = new ArrayList<>();

	public SachThamKhao(String tenSach, int soTrang, int nam, String tacGia, int gia, String linhVuc,
			List<Chuong> dsChuongSach) {
		super(tenSach, soTrang, nam, tacGia, gia);
		this.linhVuc = linhVuc;
		this.dsChuongSach = dsChuongSach;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dsChuongSach, linhVuc);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SachThamKhao other = (SachThamKhao) obj;
		return Objects.equals(dsChuongSach, other.dsChuongSach) && Objects.equals(linhVuc, other.linhVuc);
	}

}