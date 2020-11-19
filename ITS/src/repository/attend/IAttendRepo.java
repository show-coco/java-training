package repository.attend;

import java.util.ArrayList;
import java.util.Date;

import domain.attend.AttendDate;
import domain.attend.AttendStatus;
import domain.employee.EmpId;

public interface IAttendRepo {
	void save(AttendStatus as);
	ArrayList<AttendStatus> get(EmpId empId);
	AttendStatus get(EmpId empId, AttendDate date, int type); 
}
