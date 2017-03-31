package firstweek;

// 多选题
public class MultiChoice extends Question {
	String[] options;
	String[] answerIds;

	public MultiChoice() {

	}

	public MultiChoice(String[] options, String[] answerIds) {
		super();
		this.options = options;
		this.answerIds = answerIds;
	}
}
