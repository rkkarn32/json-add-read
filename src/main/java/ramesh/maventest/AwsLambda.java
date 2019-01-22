package ramesh.maventest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AwsLambda  {

	public String handleRequest(User user, Context context) {
		System.out.println("Roll: "+user.getRoll());
		return user.getName()+", Hellow Lamda Call, Your Roll: "+user.getRoll();
	}

}
