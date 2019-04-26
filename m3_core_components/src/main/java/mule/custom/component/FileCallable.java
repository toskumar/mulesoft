package mule.custom.component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class FileCallable implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		System.out.println(getClass().getName());
		MuleMessage message = eventContext.getMessage();
		String filename = message.getProperty("filepath", PropertyScope.INVOCATION);

		File f = new File(filename);
		StringBuilder builder = new StringBuilder();

		if (!f.isFile()) {
			throw new Exception("file name found - " + filename);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		return builder.toString();

	}
}
