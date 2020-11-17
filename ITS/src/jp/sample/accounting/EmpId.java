package jp.sample.accounting;

public class EmpId {
	private String value;

	public EmpId(String value) {
		if (value.isEmpty() || value == null) throw new IllegalArgumentException("EmpIdがnullまたは空文字です");

		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpId other = (EmpId) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public boolean equals(String target) {
		return target.equals(value);
	}
}
