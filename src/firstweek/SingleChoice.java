package firstweek;

// 单选题类
public class SingleChoice extends Question {
	String[] options;// 选项
	String answerId;// 答案

	public SingleChoice() {

	}

	public SingleChoice(String text,String[] options, String answered) {
		super(text);
		this.options = options;
		this.answerId = answered;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	
}
