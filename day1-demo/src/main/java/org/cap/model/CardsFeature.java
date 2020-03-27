package org.cap.model;

public class CardsFeature {
           public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getFeatureId() {
		return FeatureId;
	}
	public void setFeatureId(int featureId) {
		FeatureId = featureId;
	}
		public int carId;
           public int FeatureId;
		public CardsFeature(int carId, int featureId) {
			super();
			this.carId = carId;
			FeatureId = featureId;
		}
}
