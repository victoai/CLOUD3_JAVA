package day14.라이브러리.최지태;

public class CJT implements 정렬하기 {
	int[] list;

	public CJT(int[] list) {
		this.list = list;
	}

	@Override
	public int[] 오름차순정렬() {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		return list;
	}
	
	@Override
	public int[] 내림차순정렬() {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] < list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		return list;
	}
}