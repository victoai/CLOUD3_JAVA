package day14.인터페이스.계산기인터페이스.최지태_;

public class JTCalculator implements Calcurator {

	@Override
	public int add(int su1, int su2) {
		return su1 + su2;
	}

	@Override
	public double add(double su1, double su2) {
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		return su1 - su2;
	}

	@Override
	public double sub(double su1, double su2) {
		return su1 - su2;
	}

	@Override
	public int times(int su1, int su2) {
		return su1 * su2;
	}

	@Override
	public double times(double su1, double su2) {
		return su1 * su2;
	}

	@Override
	public int div(int su1, int su2) {
		if (su1 == 0 || su2 == 0) {
			return 0;
		}
		return su1 / su2;
	}

	@Override
	public double div(double su1, double su2) {
		if (su1 == 0 || su2 == 0) {
			return 0;
		}
		return su1 / su2;
	}

}
