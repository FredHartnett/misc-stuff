public class MyStringStuff {

	public static void main(String[] args) {

//		String message = "CS-1240_$ommercialTermMC_TCEE71";
//		System.out.println(message.substring(9));
//		System.out.println(message.indexOf('2'));


		String dateTimeString = "11/25/2021 10:30 PM";
		System.out.println("the string before update-> " + dateTimeString);
		String dateTimeStringNew = fixTheString(dateTimeString);
		System.out.println("the string after update-> " + dateTimeStringNew);

	}


	public static int stripOutTheInt(String x) {
		int num;

		try {
			return Integer.parseInt(x.replaceAll("[^0-9]",""));
		}
		catch (NumberFormatException nfe) {
			nfe.getMessage();
		}

		return 999;
	}

	public static String fixTheString(String myDate) {
		StringBuilder sb = new StringBuilder(myDate);

		if(sb.charAt(11)=='0') {
			sb.deleteCharAt(11);
		}

		sb.deleteCharAt(7);
		sb.deleteCharAt(6);

		if(sb.charAt(3)=='0') {
			sb.deleteCharAt(3);
		}

		if(sb.charAt(0)=='0') {
			sb.deleteCharAt(0);
		}

		return sb.toString();
	}

}
