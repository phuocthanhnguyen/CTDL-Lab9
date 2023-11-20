package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DanhMucAnPham {
	private List<AnPham> dsAnPham;

	public DanhMucAnPham(List<AnPham> dsAnPham) {
		super();
		this.dsAnPham = dsAnPham;
	}

	public String xacDinhLoaiDinhAnPham(AnPham anPham) {
		String result = "";
		if (anPham instanceof TapChi) {
			result = "Tạp Chí";
		}
		if (anPham instanceof SachThamKhao) {
			result = "Sách Tham Khảo";
		}
		return result;
	}

	public boolean xacDinhTapChi10Nam(AnPham anPham) {
		if (anPham instanceof TapChi && 2021 - anPham.getNam() >= 10) {
			return true;
		}
		return false;
	}

	public boolean checkCungLoaiCungAuthor(AnPham ap1, AnPham ap2) {
		if (xacDinhLoaiDinhAnPham(ap1).equals(xacDinhLoaiDinhAnPham(ap2)) && ap1.getTacGia().equals(ap2.getTacGia())) {
			return true;
		}
		return false;
	}

	public int tongTien() {
		int result = 0;
		for (AnPham arr : dsAnPham) {
			result += arr.getGia();
		}
		return result;
	}

	public AnPham findSachThamKhaoNhieuTrangNhat() {
		int index = 0;
		for (int i = 0; i < dsAnPham.size(); i++) {
			if (dsAnPham.get(index) instanceof SachThamKhao) {
				if (dsAnPham.get(i).getSoTrang() > dsAnPham.get(index).getSoTrang()
						&& dsAnPham.get(i) instanceof SachThamKhao) {
					index = i;
				}
			} else {
				index++;
			}
		}
		return dsAnPham.get(index);
	}

	public boolean findTapChi(AnPham anpham) {
		for (AnPham arr : dsAnPham) {
			if (arr.equals(anpham)) {
				return true;
			}
		}
		return false;
	}

	public Set<AnPham> getAnPhamNamChoTruoc(int year) {
		Set<AnPham> result = new HashSet<>();
		for (AnPham arr : dsAnPham) {
			if (arr.getNam() == year && arr instanceof TapChi) {
				result.add(arr);
			}
		}
		return result;
	}

	public List<AnPham> sortAnPham() {
		Collections.sort(dsAnPham, new Comparator<AnPham>() {

			@Override
			public int compare(AnPham o1, AnPham o2) {
				if (o1.getNam() == o2.getNam()) {
					return o1.getTenSach().compareTo(o2.getTenSach());
				}
				return o2.getNam() - o1.getNam();
			}
		});
		return dsAnPham;
	}

	public Map<Integer, Integer> statisticAnPham() {
		Map<Integer, Integer> result = new HashMap<>();
		for (AnPham arr : dsAnPham) {
			result.put(arr.getNam(), result.getOrDefault(arr.getNam(), 0) + 1);
		}
		return result;
	}

}
