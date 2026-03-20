public class ResearchHub <S extends LaboratoryItem> {

	private S[] storage; //внутреннее хранилище
	private int count; //текущее количество объектов

	public ResearchHub(S[] storage, int count) {
		this.storage = storage;
		this.count = count;
	}

	public void setStorage(S[] storage) {
		this.storage = storage;
	}

	public S[] getStorage() {
		return storage;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void register(S item) {
		if (count == storage.length) {
			int newCount = storage.length * 2;
			S[] newStorage = (S[]) new LaboratoryItem[newCount];
			for(int i = 0; i < storage.length; i++) {
				newStorage[i] = storage[i];
			}
			storage = newStorage;
		}
		storage[count] = item;
		count++;
	}

	public S release(int index) {
		S item = storage[index];
		S[] newStorage = (S[]) new LaboratoryItem[storage.length - 1];
		for(int i = 0; i < index; i++) {
			newStorage[i] = storage[i];
		}
		for(int i = index + 1; i < storage.length; i++) {
			newStorage[i] = storage[i];
		}
		storage = newStorage;
		count--;
		return item;
	}

	public int indexOf(S item) {
		for(int i = 0; i < count; i++) {
			if (storage[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public void clearByHazardLevel(int limit) {
		int goodItem = 0;
		for(int i = 0; i < count; i++) {
			if (storage[i].getBiohazardLevel() <= limit) {
				if (i != goodItem) {
					storage[goodItem] = storage[i];
				}
				goodItem++;
			}
		}
		for(int i = goodItem; i < count; i++) {
			storage[i] = null;
		}
		count = goodItem;
	}

	public void adjustPurity(Number offset, Number multiplier) {
		for(int i = 0; i < count; i++) {
			if (storage[i] instanceof ResearchSample) {
				ResearchSample<?> sample = (ResearchSample<?>) storage[i];
				double purityValue = sample.getPurity().doubleValue();
				double offsetValue = offset.doubleValue();
				double multiplierValue = multiplier.doubleValue();

				double newPurity = (purityValue + offsetValue) * multiplierValue;

				//???????????????????????????????????????????????7
			}
		}
	}











	public boolean checkSession(S item, Integer sessionID) {
        Integer itemSessionID = item.getSessionID();
        return itemSessionID == sessionID;
    }



    // Аня, домашку после метода clearByHazardLevel не понял вообще. Даже нейронка не помогает. 
    // поэтому только на таком этапе остановился. Для себя, само собой, буду доделывать потом


}