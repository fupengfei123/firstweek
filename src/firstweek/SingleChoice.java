package firstweek;

// 单选题类
public class SingleChoice extends Question {
	String[] options;// 选项
	String answerId;// 答案

	public SingleChoice() {

	}

	public SingleChoice(String[] options, String answered) {
		super();
		this.options = options;
		this.answerId = answered;
	}

}
