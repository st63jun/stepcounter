package tk.stepcounter.format;

/**
 * フォーマッタのインスタンスを作成するためのファクトリクラス。
 */
public class FormatterFactory {

	/**
	 * フォーマッタのインスタンスを生成します。
	 *
	 * @param format フォーマット
	 * @return フォーマッタのインスタンス
	 */
	public static ResultFormatter getFormatter(String format){
		// nullの場合はデフォルトフォーマット
		if(format==null){
			return new DefaultFormatter();
		}
		String name = format.toLowerCase();
		// CSVフォーマット
		if(name.equals("csv")){
			return new CSVFormatter();

		// Excelフォーマット
		} else if(name.equals("excel")){
			return new ExcelFormatter();

		// デフォルトフォーマット
		} else {
			return new DefaultFormatter();
		}
	}

}
