package com.SchoolManagement.grade;

public class PassFailEvalutation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		if (point >= 70 && point <= 100)
			return "P";
		else
			return "F";
	}

}
