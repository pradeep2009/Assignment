package constructorpoly.com;

public class Job {
    int job_id;
    String job_profile;
    JoiningDate obj;
    Job(int n,String job,JoiningDate j)
    {
    	job_id=n;
    	job_profile=job;
    	obj=j;
    }
    public String toString()
    {
    	return "Job id:"+job_id+"\nJob Profile: "+job_profile+"\n"+obj;
    }
}
