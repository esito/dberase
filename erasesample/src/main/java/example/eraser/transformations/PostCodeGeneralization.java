package example.eraser.transformations;

import no.esito.anonymizer.ITransformation;

/**
 * Simple generalization sample that groups numbers into fixed buckets.
 */
public class PostCodeGeneralization implements ITransformation {

	public static final String LABEL = "PostCodeGeneralization - Create groups of 1000, 3000, 5000, etc";

	@Override
	public String transform(String input) {
		if(input == null || input.isEmpty())
			return input;
		int postcode=Integer.parseInt(input);
		return String.valueOf((postcode/2000)*2000 +1000);
	}

}
