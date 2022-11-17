package com.yash.ExceptionHandling.Student;

public class StudentResult {
	static int math;
	static int sci;
	static int it;
	static int tom;
	static int mp;

	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentResult(int math, int sci, int it, int tom, int mp) {
		super();
		this.math = math;
		this.sci = sci;
		this.it = it;
		this.tom = tom;
		this.mp = mp;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) throws ResultException, negativeMarksException {
		if (40 > math) {
			throw new ResultException("failed in Math");
		} else if (math < 0) {
			throw new negativeMarksException("please enter valid marks");
		} else {
			this.math = math;
		}

	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) throws ResultException, negativeMarksException {
		if (sci < 40) {
			throw new ResultException("failed in Science");
		} else if (sci < 0) {
			throw new negativeMarksException("please enter valid marks");
		} else {
			this.sci = sci;
		}
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) throws ResultException, negativeMarksException {
		if (it < 40) {
			throw new ResultException("failed in IT");
		} else if (it < 0) {
			throw new negativeMarksException("please enter valid marks");
		} else {
			this.it = it;
		}
	}

	public int getTom() {
		return tom;
	}

	public void setTom(int tom) throws ResultException, negativeMarksException {
		if (tom < 40) {
			throw new ResultException("failed in TOM");
		} else if (tom < 0) {
			throw new negativeMarksException("please enter valid marks");
		} else {
			this.tom = tom;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) throws ResultException, negativeMarksException {
		if (mp < 40) {
			throw new ResultException("failed in MP");
		} else if (math < 0) {
			throw new negativeMarksException("please enter valid marks");
		} else {
			this.mp = mp;
		}
	}

	@Override
	public String toString() {
		return "StudentResult [math=" + math + ", sci=" + sci + ", it=" + it + ", tom=" + tom + ", mp=" + mp + "]";
	}

	public static int totalMarks() throws failException {
		int tm = (math + sci + it + tom + mp) / 5;
		if (tm <= 40) {
			throw new failException("Student fail");
		} else {
			return (tm);
		}
	}

}
