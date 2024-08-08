import java.util.*;

public class Job {
    private String jobName;
    private String jobDescription;
    private String jobLink;
    private String jobLocation;
    public Job(String name, String description, String link, String location){
        jobName = name;
        jobDescription = description;
        jobLink = link;
        jobLocation = location;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
}
