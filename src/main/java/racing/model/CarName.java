package racing.model;

public class CarName {

	public static final int CAR_NAME_MAX_LENGTH = 5;
	private final String name;

	public CarName(String carName) {

		this.name = setCarName(carName);
	}

	private String setCarName(String carName) {

		carName = removeBlank(carName);
		carNameValidation(carName);

		return carName;
	}

	private String removeBlank(String carName) {

		return carName.replace(" ", "");
	}

	private void carNameValidation(String carName) {

		if (carName == null || carName.isEmpty() || carName.length() > CAR_NAME_MAX_LENGTH) {
			throw new IllegalArgumentException("[#ERROR#]Car Name IllegalArgumentException");
		}
	}

	public String getName() {

		return this.name;
	}

}
