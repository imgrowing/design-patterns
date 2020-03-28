package composite.department_ex;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment();
		Department financeDepartment = new FinanceDepartment();
		Department hrDepartment = new HrDepartment();
		Department itDepartment = new ItDepartment();

		HeadDepartment headDepartment = new HeadDepartment();
		headDepartment.add(salesDepartment);
		headDepartment.add(financeDepartment);
		headDepartment.add(hrDepartment);
		headDepartment.add(itDepartment);

		log.warn("Print each department");
		printDepartment(salesDepartment);
		printDepartment(financeDepartment);
		printDepartment(hrDepartment);
		printDepartment(itDepartment);

		log.warn("Print head department");
		printDepartment(headDepartment);
	}

	private static void printDepartment(Department department) {
		department.printDepartmentName();
	}

}
