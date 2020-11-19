package repository.attend;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

import domain.attend.AttendDate;
import domain.attend.AttendStatus;
import domain.employee.EmpId;

public class InMemoryAttendRepo implements IAttendRepo {
	private ArrayList<AttendStatus> AttendStatuses = new ArrayList<>();

	@Override
	public void save(AttendStatus as) {
		AttendStatuses.add(as);
	}

	@Override
	public ArrayList<AttendStatus> get(EmpId empId) {
		return (ArrayList<AttendStatus>) AttendStatuses.stream().filter(as -> as.getEmpId().equals(empId)).collect(Collectors.toList());
	}

	@Override
	public AttendStatus get(EmpId empId, AttendDate date, int type) {
		return AttendStatuses.stream()
				.filter(as -> as.getEmpId().equals(empId) && as.getDate().getValue().compareTo(date.getValue()) == 0 && as.getTypeId() == type)
				.findFirst()
				.orElse(null);
	}
	
}
