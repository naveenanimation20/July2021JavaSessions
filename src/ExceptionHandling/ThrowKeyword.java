package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

//		try {
//			throw new Exception("DATANOTFOUNDEXCEPTION");
//		} catch (Exception e) {
//			System.out.println("data not found exception....");
//			e.printStackTrace();
//		}

		String data = null;

		if (data == null) {
			try {
				throw new Exception("ExcelDATANOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("data not found exception....");
				e.printStackTrace();
			}
		}else {
			System.out.println("data is found....");
		}

	}

}
