package ramesh.maventest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AwsHellowImp implements RequestHandler<Integer, String> {

	public String handleRequest(Integer input, Context context) {
		// TODO Auto-generated method stub
		return "Hellow from Lambda Call";
	}

}
