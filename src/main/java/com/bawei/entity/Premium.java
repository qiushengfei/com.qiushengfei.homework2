package com.bawei.entity;

public class Premium {

private Integer id  ;
private String   name;
private Integer   votes;
private String   tid;
private String   asum;
private  String tname;
private String  bfb;  //白跟比
public Premium() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Premium [id=" + id + ", name=" + name + ", votes=" + votes + ", tid=" + tid + ", asum=" + asum + ", tname="
			+ tname + ", bfb=" + bfb + "]";
}
public Premium(Integer id, String name, Integer votes, String tid, String asum, String tname, String bfb) {
	super();
	this.id = id;
	this.name = name;
	this.votes = votes;
	this.tid = tid;
	this.asum = asum;
	this.tname = tname;
	this.bfb = bfb;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getVotes() {
	return votes;
}
public void setVotes(Integer votes) {
	this.votes = votes;
}
public String getTid() {
	return tid;
}
public void setTid(String tid) {
	this.tid = tid;
}
public String getAsum() {
	return asum;
}
public void setAsum(String asum) {
	this.asum = asum;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getBfb() {
	return bfb;
}
public void setBfb(String bfb) {
	this.bfb = bfb;
}

}