package Task2;

import java.util.Objects;

public class TapChi extends AnPham {
	private String tenTapChi;

	public TapChi(String tenSach, int soTrang, int nam, String tacGia, int gia, String tenTapChi) {
		super(tenSach, soTrang, nam, tacGia, gia);
		this.tenTapChi = tenTapChi;
	}

	

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tenTapChi);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TapChi other = (TapChi) obj;
		return Objects.equals(tenTapChi, other.tenTapChi);
	}

}
