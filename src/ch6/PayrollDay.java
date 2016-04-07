package ch6;

public enum PayrollDay
{
	MONDAY(PayType.WEEKDAY);

	private final PayType payType;

	PayrollDay(PayType payType)
	{
		this.payType = payType;
	}

	private enum PayType
	{
		WEEKDAY
		{
			@Override
			double overtimePay(double hours, double payRate)
			{
				return hours <= HOURS_PER_SHIFT ? 0 : (hours - HOURS_PER_SHIFT)
						* payRate / 2;
			}
		},
		WEEKEND
		{
			@Override
			double overtimePay(double hours, double payRate)
			{
				return hours * payRate / 2;
			}
		};
		abstract double overtimePay(double hrs, double payRate);

		private static final int HOURS_PER_SHIFT = 8;

		double pay(double hoursWorked, double payRate)
		{
			double basePay = hoursWorked * payRate;
			return basePay + overtimePay(hoursWorked, payRate);
		}

	}

}
