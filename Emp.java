import java.util.Date;

public class Emp{
	private int id ;
	private String ename;
	private int job_id;
	private int mgr;
	private Date joindate;
	public int getId() {
		return id;
	}
	
	public Emp(int id, String ename, int job_id, int mgr, Date joindate) {
		super();
		this.id = id;
		this.ename = ename;
		this.job_id = job_id;
		this.mgr = mgr;
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", job_id=" + job_id + ", mgr=" + mgr + ", joindate=" + joindate
				+ "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
}