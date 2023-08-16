import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SpringTemplateDome01{
	
	public static void main(String[]args){
		//创建JDBCTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource);	
		//调用方法
		String sql = "update account set balance =5000 where id = ？";
		int count = template.update(sql,3);

		@Test
		public void test(){
		//这个方法查询的结果集长度只能是1
		String sql ="select * from emp where id =?";
		Map<String,Object> map = template.queryForMap(sql,1001);
		System.out.println(map);
		}
		
		@Test
		public void test02(){
		//将每个记录封装成Map集合，再将Map封装进List集合。
		String sql ="select * from emp ";
		List<Map<String,Object>> list  = template.queryForList(sql);
		for(Map<String,Object>stringObjectMap : list){
		System.out.println(stringObjectMap);
			}
		}

		@Test
		public void test03(){
		//将每个记录封装成Map集合，再将Map封装进List集合。
		String sql ="select * from emp ";
		List<Emp> list = template.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));
		for(Emp emp :list){
		System.out.println(emp);
			}
		}
}