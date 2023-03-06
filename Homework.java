import java.util.ArrayList;

public class Homework{
	
	public static void main(String[]args) {
		ArrayList arraylist  =new ArrayList();
		arraylist.add(new News("新冠确诊病例超千万，数百万印度教徒赶赴恒河\"圣浴\"引民众担忧"));
		arraylist.add(new News("男子突然想起2个月前钓鱼还在网兜里，捞起来一看赶紧放生"));
		int size = arraylist.size();
		
		for(int i = size -1; i>=0 ; i--) {
			//System.out.println(arraylist.get(i));
			News news  = (News)arraylist.get(i);
			System.out.println(processTitle(news.getTitle()));
			
		}
		
		
	}
	// 写一个方法处理显示新闻标题
	public static String processTitle(String title) {
		if(title == null ) {
			return " ";
		}
		if(title.length() >15) {
			return title.substring(0 ,15) + "...." ;
		}else {
			return title;
		}
			
		
	}
}

class News{
	
	private String title;
	private String content;
	
	public News(String title) {
		this.title = title ;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "News [title=" + title + "]";
	   }
	
	
		
}
