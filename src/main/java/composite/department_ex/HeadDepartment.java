package composite.department_ex;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class HeadDepartment implements Department {

	private List<Department> departments = Lists.newArrayList();

	@Override
	public void printDepartmentName() {
		log.info(getClass().getSimpleName());
		departments.forEach(Department::printDepartmentName);
	}

	public void add(Department department) {
		departments.add(department);
	}

	public void remove(Department department) {
		departments.remove(department);
	}
}
