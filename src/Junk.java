public class Junk {
	public static void main(String[] args) {
//		String MonthYear = "April 2021";
//		String Month = MonthYear.substring(0,MonthYear.length()-5);
//		String Year = MonthYear.substring(MonthYear.length()-4);
//		System.out.println("->" + MonthYear + "<-");
//		System.out.println("->" + Month + "<-");
//		System.out.println("->" + Year + "<-");

//		String entriesPerPageMessage = "20 Entries per page";
//		String totalNumberOfRecordsShowingMessage = "Showing 1 to 20 of 50 entries.";
//		totalNumberOfRecordsShowingMessage =
//				totalNumberOfRecordsShowingMessage.substring(totalNumberOfRecordsShowingMessage.indexOf("f") + 2);
//		int entriesPerPage = stripOutTheInt(entriesPerPageMessage);
//		int numberOfRecords = stripOutTheInt(totalNumberOfRecordsShowingMessage);
//		int numberOfPages = (int)Math.ceil((double)numberOfRecords/entriesPerPage);
//		System.out.println("the number of entries per page: " + entriesPerPage);
//		System.out.println("the number of records: " + numberOfRecords);
//		System.out.println("# of pages-> " + numberOfPages);


//		int index_f = totalNumberOfRecords.indexOf("f");
//		totalNumberOfRecords = totalNumberOfRecords.substring(index_f + 2);
//		totalNumberOfRecords = totalNumberOfRecords.substring(0,totalNumberOfRecords.length() - 9);
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
