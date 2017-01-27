package src.concat;


import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class ToConcatStringArray  extends UDF{

	public String evaluate(String SEP,ArrayList<String> array){
		
		return StringUtils.join(array, "SEP");
		
	}
}
